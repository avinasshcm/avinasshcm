
package com.misys.bankfusion.attributes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryData" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PagingRequest" type="{http://www.misys.com/Bankfusion/Attributes}PagingRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="pagedQuery")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedQuery", namespace = "http://www.misys.com/Bankfusion/Attributes", propOrder = {
    "queryData",
    "pagingRequest"
})
public class PagedQuery {

    @XmlElement(name = "QueryData", required = true)
    protected Object queryData;
    @XmlElement(name = "PagingRequest", required = true)
    protected PagingRequest pagingRequest;

    /**
     * Gets the value of the queryData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQueryData() {
        return queryData;
    }

    /**
     * Sets the value of the queryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQueryData(Object value) {
        this.queryData = value;
    }

    /**
     * Gets the value of the pagingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PagingRequest }
     *     
     */
    public PagingRequest getPagingRequest() {
        return pagingRequest;
    }

    /**
     * Sets the value of the pagingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingRequest }
     *     
     */
    public void setPagingRequest(PagingRequest value) {
        this.pagingRequest = value;
    }

}
