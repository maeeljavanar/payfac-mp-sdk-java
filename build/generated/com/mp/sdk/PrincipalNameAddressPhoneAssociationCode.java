//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for principalNameAddressPhoneAssociationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="principalNameAddressPhoneAssociationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTHING"/>
 *     &lt;enumeration value="WRONG_PHONE"/>
 *     &lt;enumeration value="FIRST_LAST"/>
 *     &lt;enumeration value="FIRST_ADDRESS"/>
 *     &lt;enumeration value="FIRST_PHONE"/>
 *     &lt;enumeration value="LAST_ADDRESS"/>
 *     &lt;enumeration value="ADDRESS_PHONE"/>
 *     &lt;enumeration value="LAST_PHONE"/>
 *     &lt;enumeration value="FIRST_LAST_ADDRESS"/>
 *     &lt;enumeration value="FIRST_LAST_PHONE"/>
 *     &lt;enumeration value="FIRST_ADDRESS_PHONE"/>
 *     &lt;enumeration value="LAST_ADDRESS_PHONE"/>
 *     &lt;enumeration value="FIRST_LAST_ADDRESS_PHONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "principalNameAddressPhoneAssociationCode")
@XmlEnum
public enum PrincipalNameAddressPhoneAssociationCode {

    NOTHING,
    WRONG_PHONE,
    FIRST_LAST,
    FIRST_ADDRESS,
    FIRST_PHONE,
    LAST_ADDRESS,
    ADDRESS_PHONE,
    LAST_PHONE,
    FIRST_LAST_ADDRESS,
    FIRST_LAST_PHONE,
    FIRST_ADDRESS_PHONE,
    LAST_ADDRESS_PHONE,
    FIRST_LAST_ADDRESS_PHONE;

    public String value() {
        return name();
    }

    public static PrincipalNameAddressPhoneAssociationCode fromValue(String v) {
        return valueOf(v);
    }

}
