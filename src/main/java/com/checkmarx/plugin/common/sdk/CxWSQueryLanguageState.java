package com.checkmarx.plugin.common.sdk;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CxWSQueryLanguageState complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CxWSQueryLanguageState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LanguageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LanguageHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSQueryLanguageState", propOrder = {
        "languageID",
        "languageName",
        "languageHash",
        "stateCreationDate"
})
public class CxWSQueryLanguageState {

    @XmlElement(name = "LanguageID")
    protected int languageID;
    @XmlElement(name = "LanguageName")
    protected String languageName;
    @XmlElement(name = "LanguageHash")
    protected String languageHash;
    @XmlElement(name = "StateCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stateCreationDate;

    /**
     * Gets the value of the languageID property.
     */
    public int getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     */
    public void setLanguageID(int value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the languageName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

    /**
     * Gets the value of the languageHash property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageHash() {
        return languageHash;
    }

    /**
     * Sets the value of the languageHash property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageHash(String value) {
        this.languageHash = value;
    }

    /**
     * Gets the value of the stateCreationDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStateCreationDate() {
        return stateCreationDate;
    }

    /**
     * Sets the value of the stateCreationDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStateCreationDate(XMLGregorianCalendar value) {
        this.stateCreationDate = value;
    }

}
