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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for legalEntityCreateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityCreateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legalEntityName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *               &lt;pattern value="\p{IsBasicLatin}*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="legalEntityType" type="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityType"/>
 *         &lt;element name="legalEntityOwnershipType" type="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityOwnershipType"/>
 *         &lt;element name="doingBusinessAs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="taxId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="9"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="annualCreditCardSalesVolume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hasAcceptedCreditCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="address" type="{http://payfac.vantivcnp.com/api/merchant/onboard}address"/>
 *         &lt;element name="principal" type="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityPrincipal"/>
 *         &lt;element name="yearsInBusiness" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0-9]{0,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityCreateRequest", propOrder = {
    "legalEntityName",
    "legalEntityType",
    "legalEntityOwnershipType",
    "doingBusinessAs",
    "taxId",
    "contactPhone",
    "annualCreditCardSalesVolume",
    "hasAcceptedCreditCards",
    "address",
    "principal",
    "yearsInBusiness"
})
@XmlSeeAlso({
    LegalEntityRetrievalResponse.class
})
public class LegalEntityCreateRequest {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String legalEntityName;
    @XmlElement(required = true)
    protected LegalEntityType legalEntityType;
    @XmlElement(required = true)
    protected LegalEntityOwnershipType legalEntityOwnershipType;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String doingBusinessAs;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String taxId;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String contactPhone;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String annualCreditCardSalesVolume;
    protected boolean hasAcceptedCreditCards;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected LegalEntityPrincipal principal;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String yearsInBusiness;

    /**
     * Gets the value of the legalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Sets the value of the legalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityName(String value) {
        this.legalEntityName = value;
    }

    /**
     * Gets the value of the legalEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityType }
     *     
     */
    public LegalEntityType getLegalEntityType() {
        return legalEntityType;
    }

    /**
     * Sets the value of the legalEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityType }
     *     
     */
    public void setLegalEntityType(LegalEntityType value) {
        this.legalEntityType = value;
    }

    /**
     * Gets the value of the legalEntityOwnershipType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityOwnershipType }
     *     
     */
    public LegalEntityOwnershipType getLegalEntityOwnershipType() {
        return legalEntityOwnershipType;
    }

    /**
     * Sets the value of the legalEntityOwnershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityOwnershipType }
     *     
     */
    public void setLegalEntityOwnershipType(LegalEntityOwnershipType value) {
        this.legalEntityOwnershipType = value;
    }

    /**
     * Gets the value of the doingBusinessAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoingBusinessAs() {
        return doingBusinessAs;
    }

    /**
     * Sets the value of the doingBusinessAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoingBusinessAs(String value) {
        this.doingBusinessAs = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
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
     * Gets the value of the annualCreditCardSalesVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualCreditCardSalesVolume() {
        return annualCreditCardSalesVolume;
    }

    /**
     * Sets the value of the annualCreditCardSalesVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualCreditCardSalesVolume(String value) {
        this.annualCreditCardSalesVolume = value;
    }

    /**
     * Gets the value of the hasAcceptedCreditCards property.
     * 
     */
    public boolean isHasAcceptedCreditCards() {
        return hasAcceptedCreditCards;
    }

    /**
     * Sets the value of the hasAcceptedCreditCards property.
     * 
     */
    public void setHasAcceptedCreditCards(boolean value) {
        this.hasAcceptedCreditCards = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityPrincipal }
     *     
     */
    public LegalEntityPrincipal getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityPrincipal }
     *     
     */
    public void setPrincipal(LegalEntityPrincipal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the yearsInBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsInBusiness() {
        return yearsInBusiness;
    }

    /**
     * Sets the value of the yearsInBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsInBusiness(String value) {
        this.yearsInBusiness = value;
    }

}