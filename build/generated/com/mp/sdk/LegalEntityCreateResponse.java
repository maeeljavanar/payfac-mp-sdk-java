//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityCreateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityCreateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityResponse">
 *       &lt;sequence>
 *         &lt;element name="principal" type="{http://payfac.vantivcnp.com/api/merchant/onboard}legalEntityPrincipalCreateResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityCreateResponse", propOrder = {
    "principal"
})
@XmlRootElement(name = "legalEntityCreateResponse")
public class LegalEntityCreateResponse
    extends LegalEntityResponse
{

    protected LegalEntityPrincipalCreateResponse principal;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityPrincipalCreateResponse }
     *     
     */
    public LegalEntityPrincipalCreateResponse getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityPrincipalCreateResponse }
     *     
     */
    public void setPrincipal(LegalEntityPrincipalCreateResponse value) {
        this.principal = value;
    }

}
