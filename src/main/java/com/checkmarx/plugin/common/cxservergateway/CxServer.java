package com.checkmarx.plugin.common.cxservergateway;

import com.checkmarx.plugin.common.sdk.CxSDKWebService;
import com.checkmarx.plugin.common.sdk.CxSDKWebServiceSoap;
import com.checkmarx.plugin.common.sdk.CxWSResponseLoginData;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.net.URL;

/**
 * Created by eranb on 06/11/2016.
 */
public class CxServer implements ICxServer {

    private static final QName SERVICE_NAME = new QName("http://Checkmarx.com/v7", "CxSDKWebService");
    private static URL WSDL_LOCATION = CxSDKWebService.class.getClassLoader().getResource("WEB-INF/CxSDKWebService.wsdl");
    private static String PLUGIN_SDK = "/Cxwebinterface/SDK/CxSDKWebService.asmx";
    private final CxSDKWebServiceSoap client;

    String serverSoapUrl, serverRestURL;

    public CxServer(String soapUrl, String restURL) {
        this.serverSoapUrl = soapUrl;
        this.serverRestURL = restURL;
        CxSDKWebService service = new CxSDKWebService(WSDL_LOCATION, SERVICE_NAME);
        client = service.getCxSDKWebServiceSoap();
        BindingProvider bindingProvider = (BindingProvider) client;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serverSoapUrl + PLUGIN_SDK);
    }

    public String getRestURL() {
        return serverRestURL;
    }

    public CxWSResponseLoginData LoginWithToken(String ott) {
        try {
            return client.loginWithToken(ott, 1033);
        } catch (Exception e) {
            CxWSResponseLoginData response = new CxWSResponseLoginData();
            response.setIsSuccesfull(false);
            response.setErrorMessage(e.getMessage());
            return response;
        }
    }
}
