
package com.misys.bf.attributes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.misys.bf.attributes package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.misys.bf.attributes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EvtMsgParams }
     * 
     */
    public EvtMsgParams createEvtMsgParams() {
        return new EvtMsgParams();
    }

    /**
     * Create an instance of {@link EvtCollection }
     * 
     */
    public EvtCollection createEvtCollection() {
        return new EvtCollection();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

}
