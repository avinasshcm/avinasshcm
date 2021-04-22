
package com.trapedza.bankfusion.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trapedza.bankfusion.webservices package. 
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

    private final static QName _UserName_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "userName");
    private final static QName _UBRCBACCRetrieveAccountMovementsSRVResponse_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "UB_R_CB_ACC_RetrieveAccountMovements_SRVResponse");
    private final static QName _CasValidateUrl_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "casValidateUrl");
    private final static QName _Password_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "password");
    private final static QName _UserLocator_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "userLocator");
    private final static QName _CasRestletUrl_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "casRestletUrl");
    private final static QName _UBRCBACCRetrieveAccountMovementsSRVRequest_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest");
    private final static QName _PassCode_QNAME = new QName("http://webservices.bankfusion.trapedza.com", "passCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trapedza.bankfusion.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bfgenericsoapheader }
     * 
     */
    public Bfgenericsoapheader createBfgenericsoapheader() {
        return new Bfgenericsoapheader();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link UBRCBACCRetrieveAccountMovementsSRVRequestType }
     * 
     */
    public UBRCBACCRetrieveAccountMovementsSRVRequestType createUBRCBACCRetrieveAccountMovementsSRVRequestType() {
        return new UBRCBACCRetrieveAccountMovementsSRVRequestType();
    }

    /**
     * Create an instance of {@link UBRCBACCRetrieveAccountMovementsSRVResponseType }
     * 
     */
    public UBRCBACCRetrieveAccountMovementsSRVResponseType createUBRCBACCRetrieveAccountMovementsSRVResponseType() {
        return new UBRCBACCRetrieveAccountMovementsSRVResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBRCBACCRetrieveAccountMovementsSRVResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "UB_R_CB_ACC_RetrieveAccountMovements_SRVResponse")
    public JAXBElement<UBRCBACCRetrieveAccountMovementsSRVResponseType> createUBRCBACCRetrieveAccountMovementsSRVResponse(UBRCBACCRetrieveAccountMovementsSRVResponseType value) {
        return new JAXBElement<UBRCBACCRetrieveAccountMovementsSRVResponseType>(_UBRCBACCRetrieveAccountMovementsSRVResponse_QNAME, UBRCBACCRetrieveAccountMovementsSRVResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "casValidateUrl")
    public JAXBElement<String> createCasValidateUrl(String value) {
        return new JAXBElement<String>(_CasValidateUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "userLocator")
    public JAXBElement<String> createUserLocator(String value) {
        return new JAXBElement<String>(_UserLocator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "casRestletUrl")
    public JAXBElement<String> createCasRestletUrl(String value) {
        return new JAXBElement<String>(_CasRestletUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBRCBACCRetrieveAccountMovementsSRVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest")
    public JAXBElement<UBRCBACCRetrieveAccountMovementsSRVRequestType> createUBRCBACCRetrieveAccountMovementsSRVRequest(UBRCBACCRetrieveAccountMovementsSRVRequestType value) {
        return new JAXBElement<UBRCBACCRetrieveAccountMovementsSRVRequestType>(_UBRCBACCRetrieveAccountMovementsSRVRequest_QNAME, UBRCBACCRetrieveAccountMovementsSRVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.bankfusion.trapedza.com", name = "passCode")
    public JAXBElement<String> createPassCode(String value) {
        return new JAXBElement<String>(_PassCode_QNAME, String.class, null, value);
    }

}
