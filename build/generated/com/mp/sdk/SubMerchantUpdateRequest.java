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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for subMerchantUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subMerchantUpdateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amexMid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="discoverConveyedMid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerServiceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hardCodedBillingDescriptor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxTransactionAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bankRoutingNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bankAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pspMerchantId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseCurrency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="address" type="{http://payfac.vantivcnp.com/api/merchant/onboard}addressUpdatable" minOccurs="0"/>
 *         &lt;element name="primaryContact" type="{http://payfac.vantivcnp.com/api/merchant/onboard}subMerchantPrimaryContactUpdatable" minOccurs="0"/>
 *         &lt;element name="disable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fraud" type="{http://payfac.vantivcnp.com/api/merchant/onboard}subMerchantFraudFeature" minOccurs="0"/>
 *         &lt;element name="amexAcquired" type="{http://payfac.vantivcnp.com/api/merchant/onboard}subMerchantAmexAcquiredFeature" minOccurs="0"/>
 *         &lt;element name="eCheck" type="{http://payfac.vantivcnp.com/api/merchant/onboard}subMerchantECheckFeature" minOccurs="0"/>
 *         &lt;element name="subMerchantFunding" type="{http://payfac.vantivcnp.com/api/merchant/onboard}subMerchantFunding" minOccurs="0"/>
 *         &lt;element name="taxAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAuthorityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subMerchantUpdateRequest", propOrder = {
    "merchantName",
    "amexMid",
    "discoverConveyedMid",
    "url",
    "customerServiceNumber",
    "hardCodedBillingDescriptor",
    "maxTransactionAmount",
    "bankRoutingNumber",
    "bankAccountNumber",
    "pspMerchantId",
    "purchaseCurrency",
    "address",
    "primaryContact",
    "disable",
    "fraud",
    "amexAcquired",
    "eCheck",
    "subMerchantFunding",
    "taxAuthority",
    "taxAuthorityState"
})
@XmlRootElement(name = "subMerchantUpdateRequest")
public class SubMerchantUpdateRequest {

    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String merchantName;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String amexMid;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String discoverConveyedMid;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String url;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String customerServiceNumber;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String hardCodedBillingDescriptor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long maxTransactionAmount;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String bankRoutingNumber;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String bankAccountNumber;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String pspMerchantId;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String purchaseCurrency;
    protected AddressUpdatable address;
    protected SubMerchantPrimaryContactUpdatable primaryContact;
    protected Boolean disable;
    protected SubMerchantFraudFeature fraud;
    protected SubMerchantAmexAcquiredFeature amexAcquired;
    protected SubMerchantECheckFeature eCheck;
    protected SubMerchantFunding subMerchantFunding;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String taxAuthority;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String taxAuthorityState;

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the amexMid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexMid() {
        return amexMid;
    }

    /**
     * Sets the value of the amexMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexMid(String value) {
        this.amexMid = value;
    }

    /**
     * Gets the value of the discoverConveyedMid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoverConveyedMid() {
        return discoverConveyedMid;
    }

    /**
     * Sets the value of the discoverConveyedMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoverConveyedMid(String value) {
        this.discoverConveyedMid = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the customerServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceNumber() {
        return customerServiceNumber;
    }

    /**
     * Sets the value of the customerServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceNumber(String value) {
        this.customerServiceNumber = value;
    }

    /**
     * Gets the value of the hardCodedBillingDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardCodedBillingDescriptor() {
        return hardCodedBillingDescriptor;
    }

    /**
     * Sets the value of the hardCodedBillingDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardCodedBillingDescriptor(String value) {
        this.hardCodedBillingDescriptor = value;
    }

    /**
     * Gets the value of the maxTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    /**
     * Sets the value of the maxTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTransactionAmount(Long value) {
        this.maxTransactionAmount = value;
    }

    /**
     * Gets the value of the bankRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Sets the value of the bankRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingNumber(String value) {
        this.bankRoutingNumber = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the pspMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPspMerchantId() {
        return pspMerchantId;
    }

    /**
     * Sets the value of the pspMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPspMerchantId(String value) {
        this.pspMerchantId = value;
    }

    /**
     * Gets the value of the purchaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCurrency() {
        return purchaseCurrency;
    }

    /**
     * Sets the value of the purchaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCurrency(String value) {
        this.purchaseCurrency = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUpdatable }
     *     
     */
    public AddressUpdatable getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUpdatable }
     *     
     */
    public void setAddress(AddressUpdatable value) {
        this.address = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantPrimaryContactUpdatable }
     *     
     */
    public SubMerchantPrimaryContactUpdatable getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantPrimaryContactUpdatable }
     *     
     */
    public void setPrimaryContact(SubMerchantPrimaryContactUpdatable value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the disable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisable() {
        return disable;
    }

    /**
     * Sets the value of the disable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisable(Boolean value) {
        this.disable = value;
    }

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantFraudFeature }
     *     
     */
    public SubMerchantFraudFeature getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantFraudFeature }
     *     
     */
    public void setFraud(SubMerchantFraudFeature value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the amexAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantAmexAcquiredFeature }
     *     
     */
    public SubMerchantAmexAcquiredFeature getAmexAcquired() {
        return amexAcquired;
    }

    /**
     * Sets the value of the amexAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantAmexAcquiredFeature }
     *     
     */
    public void setAmexAcquired(SubMerchantAmexAcquiredFeature value) {
        this.amexAcquired = value;
    }

    /**
     * Gets the value of the eCheck property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantECheckFeature }
     *     
     */
    public SubMerchantECheckFeature getECheck() {
        return eCheck;
    }

    /**
     * Sets the value of the eCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantECheckFeature }
     *     
     */
    public void setECheck(SubMerchantECheckFeature value) {
        this.eCheck = value;
    }

    /**
     * Gets the value of the subMerchantFunding property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantFunding }
     *     
     */
    public SubMerchantFunding getSubMerchantFunding() {
        return subMerchantFunding;
    }

    /**
     * Sets the value of the subMerchantFunding property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantFunding }
     *     
     */
    public void setSubMerchantFunding(SubMerchantFunding value) {
        this.subMerchantFunding = value;
    }

    /**
     * Gets the value of the taxAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAuthority() {
        return taxAuthority;
    }

    /**
     * Sets the value of the taxAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAuthority(String value) {
        this.taxAuthority = value;
    }

    /**
     * Gets the value of the taxAuthorityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAuthorityState() {
        return taxAuthorityState;
    }

    /**
     * Sets the value of the taxAuthorityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAuthorityState(String value) {
        this.taxAuthorityState = value;
    }

}