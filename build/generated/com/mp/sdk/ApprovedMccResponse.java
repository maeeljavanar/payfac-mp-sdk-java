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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for approvedMccResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvedMccResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://payfac.vantivcnp.com/api/merchant/onboard}response">
 *       &lt;sequence>
 *         &lt;element name="approvedMccs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="approvedMcc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvedMccResponse", propOrder = {
    "approvedMccs"
})
@XmlRootElement(name = "approvedMccResponse")
public class ApprovedMccResponse
    extends Response
{

    protected ApprovedMccResponse.ApprovedMccs approvedMccs;

    /**
     * Gets the value of the approvedMccs property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovedMccResponse.ApprovedMccs }
     *     
     */
    public ApprovedMccResponse.ApprovedMccs getApprovedMccs() {
        return approvedMccs;
    }

    /**
     * Sets the value of the approvedMccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovedMccResponse.ApprovedMccs }
     *     
     */
    public void setApprovedMccs(ApprovedMccResponse.ApprovedMccs value) {
        this.approvedMccs = value;
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
     *         &lt;element name="approvedMcc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "approvedMccs"
    })
    public static class ApprovedMccs {

        @XmlElement(name = "approvedMcc")
        @XmlJavaTypeAdapter(Adapter3 .class)
        protected List<String> approvedMccs;

        /**
         * Gets the value of the approvedMccs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the approvedMccs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApprovedMccs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getApprovedMccs() {
            if (approvedMccs == null) {
                approvedMccs = new ArrayList<String>();
            }
            return this.approvedMccs;
        }

    }

}