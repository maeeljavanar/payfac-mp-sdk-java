//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for legalEntityAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalEntityAgreementType" type="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityAgreementType"/>
 *         &lt;element name="agreementVersion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="userFullName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="userSystemName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="userIPAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *               &lt;pattern value="([a-zA-Z0-9.:])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="manuallyEntered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acceptanceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityAgreement", propOrder = {
    "legalEntityAgreementType",
    "agreementVersion",
    "userFullName",
    "userSystemName",
    "userIPAddress",
    "manuallyEntered",
    "acceptanceDateTime"
})
public class LegalEntityAgreement {

    @XmlElement(required = true)
    protected LegalEntityAgreementType legalEntityAgreementType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String agreementVersion;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String userFullName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String userSystemName;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String userIPAddress;
    protected Boolean manuallyEntered;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptanceDateTime;

    /**
     * Gets the value of the legalEntityAgreementType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityAgreementType }
     *     
     */
    public LegalEntityAgreementType getLegalEntityAgreementType() {
        return legalEntityAgreementType;
    }

    /**
     * Sets the value of the legalEntityAgreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityAgreementType }
     *     
     */
    public void setLegalEntityAgreementType(LegalEntityAgreementType value) {
        this.legalEntityAgreementType = value;
    }

    /**
     * Gets the value of the agreementVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementVersion() {
        return agreementVersion;
    }

    /**
     * Sets the value of the agreementVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementVersion(String value) {
        this.agreementVersion = value;
    }

    /**
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
    }

    /**
     * Gets the value of the userSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSystemName() {
        return userSystemName;
    }

    /**
     * Sets the value of the userSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSystemName(String value) {
        this.userSystemName = value;
    }

    /**
     * Gets the value of the userIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIPAddress() {
        return userIPAddress;
    }

    /**
     * Sets the value of the userIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIPAddress(String value) {
        this.userIPAddress = value;
    }

    /**
     * Gets the value of the manuallyEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuallyEntered() {
        return manuallyEntered;
    }

    /**
     * Sets the value of the manuallyEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyEntered(Boolean value) {
        this.manuallyEntered = value;
    }

    /**
     * Gets the value of the acceptanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDateTime() {
        return acceptanceDateTime;
    }

    /**
     * Sets the value of the acceptanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptanceDateTime(XMLGregorianCalendar value) {
        this.acceptanceDateTime = value;
    }

}
