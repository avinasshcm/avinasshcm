
package com.misys.cbs.msgs.v1r0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.misys.bankfusion.attributes.PagedQuery;
import com.misys.cbs.types.AccountBasicDetails;
import com.misys.cbs.types.AcctMovement;
import com.misys.cbs.types.header.RsHeader;


/**
 * 
 * 				The CBS list account Response message consists of the
 * 				following attributes
 * 			
 * 
 * <p>Java class for retrieveAcctMvmntRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveAcctMvmntRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsHeader" type="{http://www.misys.com/cbs/types/header}rsHeader"/>
 *         &lt;element name="accountBasicDetails" type="{http://www.misys.com/cbs/types}accountBasicDetails"/>
 *         &lt;element name="bFBalance" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="cFBalance" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="pagingInfo" type="{http://www.misys.com/Bankfusion/Attributes}PagedQuery"/>
 *         &lt;element name="accountMovements" type="{http://www.misys.com/cbs/types}acctMovement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hostExtension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveAcctMvmntRs", propOrder = {
    "rsHeader",
    "accountBasicDetails",
    "bfBalance",
    "cfBalance",
    "pagingInfo",
    "accountMovements",
    "userExtension",
    "hostExtension"
})
public class RetrieveAcctMvmntRs {

    @XmlElement(required = true)
    protected RsHeader rsHeader;
    @XmlElement(required = true)
    protected AccountBasicDetails accountBasicDetails;
    @XmlElement(name = "bFBalance")
    protected BigDecimal bfBalance;
    @XmlElement(name = "cFBalance")
    protected BigDecimal cfBalance;
    @XmlElement(required = true)
    protected PagedQuery pagingInfo;
    protected List<AcctMovement> accountMovements;
    protected Object userExtension;
    protected Object hostExtension;

    /**
     * Gets the value of the rsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RsHeader }
     *     
     */
    public RsHeader getRsHeader() {
        return rsHeader;
    }

    /**
     * Sets the value of the rsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RsHeader }
     *     
     */
    public void setRsHeader(RsHeader value) {
        this.rsHeader = value;
    }

    /**
     * Gets the value of the accountBasicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicDetails }
     *     
     */
    public AccountBasicDetails getAccountBasicDetails() {
        return accountBasicDetails;
    }

    /**
     * Sets the value of the accountBasicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicDetails }
     *     
     */
    public void setAccountBasicDetails(AccountBasicDetails value) {
        this.accountBasicDetails = value;
    }

    /**
     * Gets the value of the bfBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBFBalance() {
        return bfBalance;
    }

    /**
     * Sets the value of the bfBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBFBalance(BigDecimal value) {
        this.bfBalance = value;
    }

    /**
     * Gets the value of the cfBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCFBalance() {
        return cfBalance;
    }

    /**
     * Sets the value of the cfBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCFBalance(BigDecimal value) {
        this.cfBalance = value;
    }

    /**
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagedQuery }
     *     
     */
    public PagedQuery getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedQuery }
     *     
     */
    public void setPagingInfo(PagedQuery value) {
        this.pagingInfo = value;
    }

    /**
     * Gets the value of the accountMovements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountMovements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountMovements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctMovement }
     * 
     * 
     */
    public List<AcctMovement> getAccountMovements() {
        if (accountMovements == null) {
            accountMovements = new ArrayList<AcctMovement>();
        }
        return this.accountMovements;
    }

    /**
     * Gets the value of the userExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserExtension() {
        return userExtension;
    }

    /**
     * Sets the value of the userExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserExtension(Object value) {
        this.userExtension = value;
    }

    /**
     * Gets the value of the hostExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostExtension() {
        return hostExtension;
    }

    /**
     * Sets the value of the hostExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostExtension(Object value) {
        this.hostExtension = value;
    }

}
