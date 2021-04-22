
package com.misys.bankfusion.attributes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.misys.bankfusion.attributes package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.misys.bankfusion.attributes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BFHeader }
     * 
     */
    public BFHeader createBFHeader() {
        return new BFHeader();
    }

    /**
     * Create an instance of {@link BFHeaderExtension }
     * 
     */
    public BFHeaderExtension createBFHeaderExtension() {
        return new BFHeaderExtension();
    }

    /**
     * Create an instance of {@link BFCurrencyAmount }
     * 
     */
    public BFCurrencyAmount createBFCurrencyAmount() {
        return new BFCurrencyAmount();
    }

    /**
     * Create an instance of {@link PagingRequest }
     * 
     */
    public PagingRequest createPagingRequest() {
        return new PagingRequest();
    }

    /**
     * Create an instance of {@link PagedQuery }
     * 
     */
    public PagedQuery createPagedQuery() {
        return new PagedQuery();
    }

}
