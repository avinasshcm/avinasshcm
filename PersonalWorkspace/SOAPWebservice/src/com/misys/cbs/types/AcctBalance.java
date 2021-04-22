
package com.misys.cbs.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acctBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountBalance" type="{http://www.misys.com/cbs/types}amountEdited" minOccurs="0"/>
 *         &lt;element name="BalanceCurrency" type="{http://www.misys.com/cbs/types}isoCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctBalance", propOrder = {
    "accountBalance",
    "balanceCurrency"
})
public class AcctBalance {

    @XmlElement(name = "AccountBalance")
    protected BigDecimal accountBalance;
    @XmlElement(name = "BalanceCurrency")
    protected String balanceCurrency;

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountBalance(BigDecimal value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the balanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceCurrency() {
        return balanceCurrency;
    }

    /**
     * Sets the value of the balanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceCurrency(String value) {
        this.balanceCurrency = value;
    }

}
