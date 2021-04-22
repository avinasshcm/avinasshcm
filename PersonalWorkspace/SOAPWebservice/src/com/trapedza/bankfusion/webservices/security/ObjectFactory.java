
package com.trapedza.bankfusion.webservices.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trapedza.bankfusion.webservices.security package. 
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

    private final static QName _Response_QNAME = new QName("http://security.webservices.bankfusion.trapedza.com", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trapedza.bankfusion.webservices.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link OSUserID }
     * 
     */
    public OSUserID createOSUserID() {
        return new OSUserID();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link PassCode }
     * 
     */
    public PassCode createPassCode() {
        return new PassCode();
    }

    /**
     * Create an instance of {@link UserName }
     * 
     */
    public UserName createUserName() {
        return new UserName();
    }

    /**
     * Create an instance of {@link ApplicationID }
     * 
     */
    public ApplicationID createApplicationID() {
        return new ApplicationID();
    }

    /**
     * Create an instance of {@link Password }
     * 
     */
    public Password createPassword() {
        return new Password();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.webservices.bankfusion.trapedza.com", name = "response")
    public JAXBElement<LoginResponseType> createResponse(LoginResponseType value) {
        return new JAXBElement<LoginResponseType>(_Response_QNAME, LoginResponseType.class, null, value);
    }

}
