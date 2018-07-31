//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.31 at 02:41:20 PM EDT 
//


package com.mp.sdk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mp.sdk package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LegalEntityResponse_QNAME = new QName("http://payfac.vantivcnp.com/api/merchant/onboard", "legalEntityResponse");
    private final static QName _LegalEntityCreateRequest_QNAME = new QName("http://payfac.vantivcnp.com/api/merchant/onboard", "legalEntityCreateRequest");
    private final static QName _SubMerchantCreateRequest_QNAME = new QName("http://payfac.vantivcnp.com/api/merchant/onboard", "subMerchantCreateRequest");
    private final static QName _Response_QNAME = new QName("http://payfac.vantivcnp.com/api/merchant/onboard", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mp.sdk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubMerchantCreateResponse }
     * 
     */
    public SubMerchantCreateResponse createSubMerchantCreateResponse() {
        return new SubMerchantCreateResponse();
    }

    /**
     * Create an instance of {@link SubMerchantRetrievalResponse }
     * 
     */
    public SubMerchantRetrievalResponse createSubMerchantRetrievalResponse() {
        return new SubMerchantRetrievalResponse();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link ApprovedMccResponse }
     * 
     */
    public ApprovedMccResponse createApprovedMccResponse() {
        return new ApprovedMccResponse();
    }

    /**
     * Create an instance of {@link LegalEntityAgreementRetrievalResponse }
     * 
     */
    public LegalEntityAgreementRetrievalResponse createLegalEntityAgreementRetrievalResponse() {
        return new LegalEntityAgreementRetrievalResponse();
    }

    /**
     * Create an instance of {@link BusinessVerificationResult }
     * 
     */
    public BusinessVerificationResult createBusinessVerificationResult() {
        return new BusinessVerificationResult();
    }

    /**
     * Create an instance of {@link PrincipalVerificationResult }
     * 
     */
    public PrincipalVerificationResult createPrincipalVerificationResult() {
        return new PrincipalVerificationResult();
    }

    /**
     * Create an instance of {@link PrincipalDeleteResponse }
     * 
     */
    public PrincipalDeleteResponse createPrincipalDeleteResponse() {
        return new PrincipalDeleteResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link SubMerchantCredentials }
     * 
     */
    public SubMerchantCredentials createSubMerchantCredentials() {
        return new SubMerchantCredentials();
    }

    /**
     * Create an instance of {@link SubMerchantCreateResponse.PaypageCredentials }
     * 
     */
    public SubMerchantCreateResponse.PaypageCredentials createSubMerchantCreateResponsePaypageCredentials() {
        return new SubMerchantCreateResponse.PaypageCredentials();
    }

    /**
     * Create an instance of {@link SubMerchantCreateRequest }
     * 
     */
    public SubMerchantCreateRequest createSubMerchantCreateRequest() {
        return new SubMerchantCreateRequest();
    }

    /**
     * Create an instance of {@link LegalEntityUpdateRequest }
     * 
     */
    public LegalEntityUpdateRequest createLegalEntityUpdateRequest() {
        return new LegalEntityUpdateRequest();
    }

    /**
     * Create an instance of {@link AddressUpdatable }
     * 
     */
    public AddressUpdatable createAddressUpdatable() {
        return new AddressUpdatable();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipalUpdatable }
     * 
     */
    public LegalEntityPrincipalUpdatable createLegalEntityPrincipalUpdatable() {
        return new LegalEntityPrincipalUpdatable();
    }

    /**
     * Create an instance of {@link LegalEntityBackgroundCheckFields }
     * 
     */
    public LegalEntityBackgroundCheckFields createLegalEntityBackgroundCheckFields() {
        return new LegalEntityBackgroundCheckFields();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipalDeleteResponse }
     * 
     */
    public LegalEntityPrincipalDeleteResponse createLegalEntityPrincipalDeleteResponse() {
        return new LegalEntityPrincipalDeleteResponse();
    }

    /**
     * Create an instance of {@link LegalEntityAgreementCreateRequest }
     * 
     */
    public LegalEntityAgreementCreateRequest createLegalEntityAgreementCreateRequest() {
        return new LegalEntityAgreementCreateRequest();
    }

    /**
     * Create an instance of {@link LegalEntityAgreement }
     * 
     */
    public LegalEntityAgreement createLegalEntityAgreement() {
        return new LegalEntityAgreement();
    }

    /**
     * Create an instance of {@link SubMerchantFraudFeature }
     * 
     */
    public SubMerchantFraudFeature createSubMerchantFraudFeature() {
        return new SubMerchantFraudFeature();
    }

    /**
     * Create an instance of {@link SubMerchantAmexAcquiredFeature }
     * 
     */
    public SubMerchantAmexAcquiredFeature createSubMerchantAmexAcquiredFeature() {
        return new SubMerchantAmexAcquiredFeature();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SubMerchantPrimaryContact }
     * 
     */
    public SubMerchantPrimaryContact createSubMerchantPrimaryContact() {
        return new SubMerchantPrimaryContact();
    }

    /**
     * Create an instance of {@link SubMerchantECheckFeature }
     * 
     */
    public SubMerchantECheckFeature createSubMerchantECheckFeature() {
        return new SubMerchantECheckFeature();
    }

    /**
     * Create an instance of {@link SubMerchantFunding }
     * 
     */
    public SubMerchantFunding createSubMerchantFunding() {
        return new SubMerchantFunding();
    }

    /**
     * Create an instance of {@link SubMerchantRetrievalResponse.PaypageCredentials }
     * 
     */
    public SubMerchantRetrievalResponse.PaypageCredentials createSubMerchantRetrievalResponsePaypageCredentials() {
        return new SubMerchantRetrievalResponse.PaypageCredentials();
    }

    /**
     * Create an instance of {@link ErrorResponse.Errors }
     * 
     */
    public ErrorResponse.Errors createErrorResponseErrors() {
        return new ErrorResponse.Errors();
    }

    /**
     * Create an instance of {@link LegalEntityCreateRequest }
     * 
     */
    public LegalEntityCreateRequest createLegalEntityCreateRequest() {
        return new LegalEntityCreateRequest();
    }

    /**
     * Create an instance of {@link LegalEntityResponse }
     * 
     */
    public LegalEntityResponse createLegalEntityResponse() {
        return new LegalEntityResponse();
    }

    /**
     * Create an instance of {@link PrincipalCreateResponse }
     * 
     */
    public PrincipalCreateResponse createPrincipalCreateResponse() {
        return new PrincipalCreateResponse();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipalCreateResponseWithResponseFields }
     * 
     */
    public LegalEntityPrincipalCreateResponseWithResponseFields createLegalEntityPrincipalCreateResponseWithResponseFields() {
        return new LegalEntityPrincipalCreateResponseWithResponseFields();
    }

    /**
     * Create an instance of {@link LegalEntityRetrievalResponse }
     * 
     */
    public LegalEntityRetrievalResponse createLegalEntityRetrievalResponse() {
        return new LegalEntityRetrievalResponse();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipal }
     * 
     */
    public LegalEntityPrincipal createLegalEntityPrincipal() {
        return new LegalEntityPrincipal();
    }

    /**
     * Create an instance of {@link BackgroundCheckResults }
     * 
     */
    public BackgroundCheckResults createBackgroundCheckResults() {
        return new BackgroundCheckResults();
    }

    /**
     * Create an instance of {@link BusinessResult }
     * 
     */
    public BusinessResult createBusinessResult() {
        return new BusinessResult();
    }

    /**
     * Create an instance of {@link PrincipalResult }
     * 
     */
    public PrincipalResult createPrincipalResult() {
        return new PrincipalResult();
    }

    /**
     * Create an instance of {@link BusinessToPrincipalAssociation }
     * 
     */
    public BusinessToPrincipalAssociation createBusinessToPrincipalAssociation() {
        return new BusinessToPrincipalAssociation();
    }

    /**
     * Create an instance of {@link BankruptcyResult }
     * 
     */
    public BankruptcyResult createBankruptcyResult() {
        return new BankruptcyResult();
    }

    /**
     * Create an instance of {@link LienResult }
     * 
     */
    public LienResult createLienResult() {
        return new LienResult();
    }

    /**
     * Create an instance of {@link ApprovedMccResponse.ApprovedMccs }
     * 
     */
    public ApprovedMccResponse.ApprovedMccs createApprovedMccResponseApprovedMccs() {
        return new ApprovedMccResponse.ApprovedMccs();
    }

    /**
     * Create an instance of {@link LegalEntityCreateResponse }
     * 
     */
    public LegalEntityCreateResponse createLegalEntityCreateResponse() {
        return new LegalEntityCreateResponse();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipalCreateResponse }
     * 
     */
    public LegalEntityPrincipalCreateResponse createLegalEntityPrincipalCreateResponse() {
        return new LegalEntityPrincipalCreateResponse();
    }

    /**
     * Create an instance of {@link LegalEntityPrincipalCreateRequest }
     * 
     */
    public LegalEntityPrincipalCreateRequest createLegalEntityPrincipalCreateRequest() {
        return new LegalEntityPrincipalCreateRequest();
    }

    /**
     * Create an instance of {@link LegalEntityAgreementCreateResponse }
     * 
     */
    public LegalEntityAgreementCreateResponse createLegalEntityAgreementCreateResponse() {
        return new LegalEntityAgreementCreateResponse();
    }

    /**
     * Create an instance of {@link LegalEntityAgreementRetrievalResponse.Agreements }
     * 
     */
    public LegalEntityAgreementRetrievalResponse.Agreements createLegalEntityAgreementRetrievalResponseAgreements() {
        return new LegalEntityAgreementRetrievalResponse.Agreements();
    }

    /**
     * Create an instance of {@link SubMerchantUpdateRequest }
     * 
     */
    public SubMerchantUpdateRequest createSubMerchantUpdateRequest() {
        return new SubMerchantUpdateRequest();
    }

    /**
     * Create an instance of {@link SubMerchantPrimaryContactUpdatable }
     * 
     */
    public SubMerchantPrimaryContactUpdatable createSubMerchantPrimaryContactUpdatable() {
        return new SubMerchantPrimaryContactUpdatable();
    }

    /**
     * Create an instance of {@link BusinessNameAddressPhoneAssociation }
     * 
     */
    public BusinessNameAddressPhoneAssociation createBusinessNameAddressPhoneAssociation() {
        return new BusinessNameAddressPhoneAssociation();
    }

    /**
     * Create an instance of {@link PrincipalAddress }
     * 
     */
    public PrincipalAddress createPrincipalAddress() {
        return new PrincipalAddress();
    }

    /**
     * Create an instance of {@link PotentialRiskIndicator }
     * 
     */
    public PotentialRiskIndicator createPotentialRiskIndicator() {
        return new PotentialRiskIndicator();
    }

    /**
     * Create an instance of {@link PrincipalBackgroundCheckFields }
     * 
     */
    public PrincipalBackgroundCheckFields createPrincipalBackgroundCheckFields() {
        return new PrincipalBackgroundCheckFields();
    }

    /**
     * Create an instance of {@link BusinessVerificationIndicators }
     * 
     */
    public BusinessVerificationIndicators createBusinessVerificationIndicators() {
        return new BusinessVerificationIndicators();
    }

    /**
     * Create an instance of {@link PrincipalVerificationIndicators }
     * 
     */
    public PrincipalVerificationIndicators createPrincipalVerificationIndicators() {
        return new PrincipalVerificationIndicators();
    }

    /**
     * Create an instance of {@link PrincipalNameAddressPhoneAssociation }
     * 
     */
    public PrincipalNameAddressPhoneAssociation createPrincipalNameAddressPhoneAssociation() {
        return new PrincipalNameAddressPhoneAssociation();
    }

    /**
     * Create an instance of {@link NameAddressTaxIdAssociation }
     * 
     */
    public NameAddressTaxIdAssociation createNameAddressTaxIdAssociation() {
        return new NameAddressTaxIdAssociation();
    }

    /**
     * Create an instance of {@link PrincipalScore }
     * 
     */
    public PrincipalScore createPrincipalScore() {
        return new PrincipalScore();
    }

    /**
     * Create an instance of {@link BusinessScore }
     * 
     */
    public BusinessScore createBusinessScore() {
        return new BusinessScore();
    }

    /**
     * Create an instance of {@link PaypageCredential }
     * 
     */
    public PaypageCredential createPaypageCredential() {
        return new PaypageCredential();
    }

    /**
     * Create an instance of {@link NameAddressSsnAssociation }
     * 
     */
    public NameAddressSsnAssociation createNameAddressSsnAssociation() {
        return new NameAddressSsnAssociation();
    }

    /**
     * Create an instance of {@link BusinessVerificationResult.RiskIndicators }
     * 
     */
    public BusinessVerificationResult.RiskIndicators createBusinessVerificationResultRiskIndicators() {
        return new BusinessVerificationResult.RiskIndicators();
    }

    /**
     * Create an instance of {@link PrincipalVerificationResult.RiskIndicators }
     * 
     */
    public PrincipalVerificationResult.RiskIndicators createPrincipalVerificationResultRiskIndicators() {
        return new PrincipalVerificationResult.RiskIndicators();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payfac.vantivcnp.com/api/merchant/onboard", name = "legalEntityResponse")
    public JAXBElement<LegalEntityResponse> createLegalEntityResponse(LegalEntityResponse value) {
        return new JAXBElement<LegalEntityResponse>(_LegalEntityResponse_QNAME, LegalEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalEntityCreateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payfac.vantivcnp.com/api/merchant/onboard", name = "legalEntityCreateRequest")
    public JAXBElement<LegalEntityCreateRequest> createLegalEntityCreateRequest(LegalEntityCreateRequest value) {
        return new JAXBElement<LegalEntityCreateRequest>(_LegalEntityCreateRequest_QNAME, LegalEntityCreateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubMerchantCreateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payfac.vantivcnp.com/api/merchant/onboard", name = "subMerchantCreateRequest")
    public JAXBElement<SubMerchantCreateRequest> createSubMerchantCreateRequest(SubMerchantCreateRequest value) {
        return new JAXBElement<SubMerchantCreateRequest>(_SubMerchantCreateRequest_QNAME, SubMerchantCreateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payfac.vantivcnp.com/api/merchant/onboard", name = "response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

}