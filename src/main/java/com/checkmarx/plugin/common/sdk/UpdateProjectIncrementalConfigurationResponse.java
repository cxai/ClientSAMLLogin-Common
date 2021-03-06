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
 *         &lt;element name="UpdateProjectIncrementalConfigurationResult" type="{http://Checkmarx.com/v7}CxWSBasicRepsonse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateProjectIncrementalConfigurationResult"
})
@XmlRootElement(name = "UpdateProjectIncrementalConfigurationResponse")
public class UpdateProjectIncrementalConfigurationResponse {

    @XmlElement(name = "UpdateProjectIncrementalConfigurationResult")
    protected CxWSBasicRepsonse updateProjectIncrementalConfigurationResult;

    /**
     * Gets the value of the updateProjectIncrementalConfigurationResult property.
     *
     * @return possible object is
     * {@link CxWSBasicRepsonse }
     */
    public CxWSBasicRepsonse getUpdateProjectIncrementalConfigurationResult() {
        return updateProjectIncrementalConfigurationResult;
    }

    /**
     * Sets the value of the updateProjectIncrementalConfigurationResult property.
     *
     * @param value allowed object is
     *              {@link CxWSBasicRepsonse }
     */
    public void setUpdateProjectIncrementalConfigurationResult(CxWSBasicRepsonse value) {
        this.updateProjectIncrementalConfigurationResult = value;
    }

}
