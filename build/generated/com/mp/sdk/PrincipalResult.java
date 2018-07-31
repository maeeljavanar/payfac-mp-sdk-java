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
 * <p>Java class for principalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="principalResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verificationResult" type="{http://payfac.vantivcnp.com/api/merchant/onboard}principalVerificationResult" minOccurs="0"/>
 *         &lt;element name="backgroundCheckDecisionNotes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2000"/>
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
@XmlType(name = "principalResult", propOrder = {
    "verificationResult",
    "backgroundCheckDecisionNotes"
})
public class PrincipalResult {

    protected PrincipalVerificationResult verificationResult;
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String backgroundCheckDecisionNotes;

    /**
     * Gets the value of the verificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalVerificationResult }
     *     
     */
    public PrincipalVerificationResult getVerificationResult() {
        return verificationResult;
    }

    /**
     * Sets the value of the verificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalVerificationResult }
     *     
     */
    public void setVerificationResult(PrincipalVerificationResult value) {
        this.verificationResult = value;
    }

    /**
     * Gets the value of the backgroundCheckDecisionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundCheckDecisionNotes() {
        return backgroundCheckDecisionNotes;
    }

    /**
     * Sets the value of the backgroundCheckDecisionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundCheckDecisionNotes(String value) {
        this.backgroundCheckDecisionNotes = value;
    }

}
