package com.checkmarx.plugin.common.sdk;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetConfigurationSetListResult" type="{http://Checkmarx.com/v7}CxWSResponseConfigSetList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getConfigurationSetListResult"
})
@XmlRootElement(name = "GetConfigurationSetListResponse")
public class GetConfigurationSetListResponse {

    @XmlElement(name = "GetConfigurationSetListResult")
    protected CxWSResponseConfigSetList getConfigurationSetListResult;

    /**
     * Gets the value of the getConfigurationSetListResult property.
     *
     * @return possible object is
     * {@link CxWSResponseConfigSetList }
     */
    public CxWSResponseConfigSetList getGetConfigurationSetListResult() {
        return getConfigurationSetListResult;
    }

    /**
     * Sets the value of the getConfigurationSetListResult property.
     *
     * @param value allowed object is
     *              {@link CxWSResponseConfigSetList }
     */
    public void setGetConfigurationSetListResult(CxWSResponseConfigSetList value) {
        this.getConfigurationSetListResult = value;
    }

}
