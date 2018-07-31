//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessVerificationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessVerificationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallScore" type="{http://payfac.vantivcnp.com/api/merchant/onboard}businessScore" minOccurs="0"/>
 *         &lt;element name="nameAddressTaxIdAssociation" type="{http://payfac.vantivcnp.com/api/merchant/onboard}nameAddressTaxIdAssociation" minOccurs="0"/>
 *         &lt;element name="nameAddressPhoneAssociation" type="{http://payfac.vantivcnp.com/api/merchant/onboard}businessNameAddressPhoneAssociation" minOccurs="0"/>
 *         &lt;element name="verificationIndicators" type="{http://payfac.vantivcnp.com/api/merchant/onboard}businessVerificationIndicators" minOccurs="0"/>
 *         &lt;element name="riskIndicators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="riskIndicator" type="{http://payfac.vantivcnp.com/api/merchant/onboard}potentialRiskIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "businessVerificationResult", propOrder = {
    "overallScore",
    "nameAddressTaxIdAssociation",
    "nameAddressPhoneAssociation",
    "verificationIndicators",
    "riskIndicators"
})
public class BusinessVerificationResult {

    protected BusinessScore overallScore;
    protected NameAddressTaxIdAssociation nameAddressTaxIdAssociation;
    protected BusinessNameAddressPhoneAssociation nameAddressPhoneAssociation;
    protected BusinessVerificationIndicators verificationIndicators;
    protected BusinessVerificationResult.RiskIndicators riskIndicators;

    /**
     * Gets the value of the overallScore property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScore }
     *     
     */
    public BusinessScore getOverallScore() {
        return overallScore;
    }

    /**
     * Sets the value of the overallScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScore }
     *     
     */
    public void setOverallScore(BusinessScore value) {
        this.overallScore = value;
    }

    /**
     * Gets the value of the nameAddressTaxIdAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link NameAddressTaxIdAssociation }
     *     
     */
    public NameAddressTaxIdAssociation getNameAddressTaxIdAssociation() {
        return nameAddressTaxIdAssociation;
    }

    /**
     * Sets the value of the nameAddressTaxIdAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAddressTaxIdAssociation }
     *     
     */
    public void setNameAddressTaxIdAssociation(NameAddressTaxIdAssociation value) {
        this.nameAddressTaxIdAssociation = value;
    }

    /**
     * Gets the value of the nameAddressPhoneAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessNameAddressPhoneAssociation }
     *     
     */
    public BusinessNameAddressPhoneAssociation getNameAddressPhoneAssociation() {
        return nameAddressPhoneAssociation;
    }

    /**
     * Sets the value of the nameAddressPhoneAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessNameAddressPhoneAssociation }
     *     
     */
    public void setNameAddressPhoneAssociation(BusinessNameAddressPhoneAssociation value) {
        this.nameAddressPhoneAssociation = value;
    }

    /**
     * Gets the value of the verificationIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessVerificationIndicators }
     *     
     */
    public BusinessVerificationIndicators getVerificationIndicators() {
        return verificationIndicators;
    }

    /**
     * Sets the value of the verificationIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessVerificationIndicators }
     *     
     */
    public void setVerificationIndicators(BusinessVerificationIndicators value) {
        this.verificationIndicators = value;
    }

    /**
     * Gets the value of the riskIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessVerificationResult.RiskIndicators }
     *     
     */
    public BusinessVerificationResult.RiskIndicators getRiskIndicators() {
        return riskIndicators;
    }

    /**
     * Sets the value of the riskIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessVerificationResult.RiskIndicators }
     *     
     */
    public void setRiskIndicators(BusinessVerificationResult.RiskIndicators value) {
        this.riskIndicators = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="riskIndicator" type="{http://payfac.vantivcnp.com/api/merchant/onboard}potentialRiskIndicator" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "riskIndicators"
    })
    public static class RiskIndicators {

        @XmlElement(name = "riskIndicator")
        protected List<PotentialRiskIndicator> riskIndicators;

        /**
         * Gets the value of the riskIndicators property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the riskIndicators property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRiskIndicators().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PotentialRiskIndicator }
         * 
         * 
         */
        public List<PotentialRiskIndicator> getRiskIndicators() {
            if (riskIndicators == null) {
                riskIndicators = new ArrayList<PotentialRiskIndicator>();
            }
            return this.riskIndicators;
        }

    }

}