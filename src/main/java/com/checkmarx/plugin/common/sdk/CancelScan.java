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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sessionID",
        "runId"
})
@XmlRootElement(name = "CancelScan")
public class CancelScan {

    protected String sessionID;
    @XmlElement(name = "RunId")
    protected String runId;

    /**
     * Gets the value of the sessionID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the runId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRunId() {
        return runId;
    }

    /**
     * Sets the value of the runId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRunId(String value) {
        this.runId = value;
    }

}
