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


/**
 * <p>Java class for principalVerificationIndicators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="principalVerificationIndicators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phoneVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ssnVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dobVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "principalVerificationIndicators", propOrder = {
    "nameVerified",
    "addressVerified",
    "phoneVerified",
    "ssnVerified",
    "dobVerified"
})
public class PrincipalVerificationIndicators {

    protected boolean nameVerified;
    protected boolean addressVerified;
    protected boolean phoneVerified;
    protected boolean ssnVerified;
    protected boolean dobVerified;

    /**
     * Gets the value of the nameVerified property.
     * 
     */
    public boolean isNameVerified() {
        return nameVerified;
    }

    /**
     * Sets the value of the nameVerified property.
     * 
     */
    public void setNameVerified(boolean value) {
        this.nameVerified = value;
    }

    /**
     * Gets the value of the addressVerified property.
     * 
     */
    public boolean isAddressVerified() {
        return addressVerified;
    }

    /**
     * Sets the value of the addressVerified property.
     * 
     */
    public void setAddressVerified(boolean value) {
        this.addressVerified = value;
    }

    /**
     * Gets the value of the phoneVerified property.
     * 
     */
    public boolean isPhoneVerified() {
        return phoneVerified;
    }

    /**
     * Sets the value of the phoneVerified property.
     * 
     */
    public void setPhoneVerified(boolean value) {
        this.phoneVerified = value;
    }

    /**
     * Gets the value of the ssnVerified property.
     * 
     */
    public boolean isSsnVerified() {
        return ssnVerified;
    }

    /**
     * Sets the value of the ssnVerified property.
     * 
     */
    public void setSsnVerified(boolean value) {
        this.ssnVerified = value;
    }

    /**
     * Gets the value of the dobVerified property.
     * 
     */
    public boolean isDobVerified() {
        return dobVerified;
    }

    /**
     * Sets the value of the dobVerified property.
     * 
     */
    public void setDobVerified(boolean value) {
        this.dobVerified = value;
    }

}