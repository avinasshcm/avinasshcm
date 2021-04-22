
package com.misys.bankfusion.attributes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestedPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingRequest", namespace = "http://www.misys.com/Bankfusion/Attributes", propOrder = {
    "numberOfRows",
    "requestedPage",
    "totalPages"
})
public class PagingRequest {

    @XmlElement(name = "NumberOfRows")
    protected int numberOfRows;
    @XmlElement(name = "RequestedPage")
    protected int requestedPage;
    @XmlElement(name = "TotalPages")
    protected int totalPages;

    /**
     * Gets the value of the numberOfRows property.
     * 
     */
    public int getNumberOfRows() {
        return numberOfRows;
    }

    /**
     * Sets the value of the numberOfRows property.
     * 
     */
    public void setNumberOfRows(int value) {
        this.numberOfRows = value;
    }

    /**
     * Gets the value of the requestedPage property.
     * 
     */
    public int getRequestedPage() {
        return requestedPage;
    }

    /**
     * Sets the value of the requestedPage property.
     * 
     */
    public void setRequestedPage(int value) {
        this.requestedPage = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
