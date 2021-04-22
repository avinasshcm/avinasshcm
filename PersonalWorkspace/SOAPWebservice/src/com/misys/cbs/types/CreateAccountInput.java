
package com.misys.cbs.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAccountInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccountInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountDetails" type="{http://www.misys.com/cbs/types}accountDetails"/>
 *         &lt;element name="jointAcctHolders" type="{http://www.misys.com/cbs/types}jointAcctHolders" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alternativeAcctId" type="{http://www.misys.com/cbs/types}alternativeAcctId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="acctClass" type="{http://www.misys.com/cbs/types}otherPartyClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mandateDetails" type="{http://www.misys.com/cbs/types}mandateDetails" minOccurs="0"/>
 *         &lt;element name="jointAccountDtls" type="{http://www.misys.com/cbs/types}jointAccountDtls" minOccurs="0"/>
 *         &lt;element name="udfDetail" type="{http://www.misys.com/cbs/types}udfDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccountInput", propOrder = {
    "accountDetails",
    "jointAcctHolders",
    "alternativeAcctId",
    "acctClass",
    "mandateDetails",
    "jointAccountDtls",
    "udfDetail"
})
public class CreateAccountInput {

    @XmlElement(required = true)
    protected AccountDetails accountDetails;
    protected List<JointAcctHolders> jointAcctHolders;
    protected List<AlternativeAcctId> alternativeAcctId;
    protected List<OtherPartyClass> acctClass;
    protected MandateDetails mandateDetails;
    protected JointAccountDtls jointAccountDtls;
    protected UdfDetails udfDetail;

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails }
     *     
     */
    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails }
     *     
     */
    public void setAccountDetails(AccountDetails value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the jointAcctHolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jointAcctHolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJointAcctHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JointAcctHolders }
     * 
     * 
     */
    public List<JointAcctHolders> getJointAcctHolders() {
        if (jointAcctHolders == null) {
            jointAcctHolders = new ArrayList<JointAcctHolders>();
        }
        return this.jointAcctHolders;
    }

    /**
     * Gets the value of the alternativeAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeAcctId }
     * 
     * 
     */
    public List<AlternativeAcctId> getAlternativeAcctId() {
        if (alternativeAcctId == null) {
            alternativeAcctId = new ArrayList<AlternativeAcctId>();
        }
        return this.alternativeAcctId;
    }

    /**
     * Gets the value of the acctClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartyClass }
     * 
     * 
     */
    public List<OtherPartyClass> getAcctClass() {
        if (acctClass == null) {
            acctClass = new ArrayList<OtherPartyClass>();
        }
        return this.acctClass;
    }

    /**
     * Gets the value of the mandateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MandateDetails }
     *     
     */
    public MandateDetails getMandateDetails() {
        return mandateDetails;
    }

    /**
     * Sets the value of the mandateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateDetails }
     *     
     */
    public void setMandateDetails(MandateDetails value) {
        this.mandateDetails = value;
    }

    /**
     * Gets the value of the jointAccountDtls property.
     * 
     * @return
     *     possible object is
     *     {@link JointAccountDtls }
     *     
     */
    public JointAccountDtls getJointAccountDtls() {
        return jointAccountDtls;
    }

    /**
     * Sets the value of the jointAccountDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JointAccountDtls }
     *     
     */
    public void setJointAccountDtls(JointAccountDtls value) {
        this.jointAccountDtls = value;
    }

    /**
     * Gets the value of the udfDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UdfDetails }
     *     
     */
    public UdfDetails getUdfDetail() {
        return udfDetail;
    }

    /**
     * Sets the value of the udfDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdfDetails }
     *     
     */
    public void setUdfDetail(UdfDetails value) {
        this.udfDetail = value;
    }

}
