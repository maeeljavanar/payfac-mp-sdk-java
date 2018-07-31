//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for legalEntityPrincipalUpdatable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityPrincipalUpdatable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emailAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="address" type="{http://payfac.vantivcnp.com/api/merchant/onboard}principalAddress" minOccurs="0"/>
 *         &lt;element name="stakePercent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="backgroundCheckFields" type="{http://payfac.vantivcnp.com/api/merchant/onboard}principalBackgroundCheckFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityPrincipalUpdatable", propOrder = {
    "principalId",
    "title",
    "emailAddress",
    "contactPhone",
    "address",
    "stakePercent",
    "backgroundCheckFields"
})
public class LegalEntityPrincipalUpdatable {

    protected int principalId;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String title;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String emailAddress;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String contactPhone;
    protected PrincipalAddress address;
    protected Integer stakePercent;
    protected PrincipalBackgroundCheckFields backgroundCheckFields;

    /**
     * Gets the value of the principalId property.
     * 
     */
    public int getPrincipalId() {
        return principalId;
    }

    /**
     * Sets the value of the principalId property.
     * 
     */
    public void setPrincipalId(int value) {
        this.principalId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAddress }
     *     
     */
    public PrincipalAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAddress }
     *     
     */
    public void setAddress(PrincipalAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the stakePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStakePercent() {
        return stakePercent;
    }

    /**
     * Sets the value of the stakePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStakePercent(Integer value) {
        this.stakePercent = value;
    }

    /**
     * Gets the value of the backgroundCheckFields property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalBackgroundCheckFields }
     *     
     */
    public PrincipalBackgroundCheckFields getBackgroundCheckFields() {
        return backgroundCheckFields;
    }

    /**
     * Sets the value of the backgroundCheckFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalBackgroundCheckFields }
     *     
     */
    public void setBackgroundCheckFields(PrincipalBackgroundCheckFields value) {
        this.backgroundCheckFields = value;
    }

}
