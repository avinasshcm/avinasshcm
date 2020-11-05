package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XIRRValues {

    List<Date> txnDate = new ArrayList<Date>();

    List<Double> txnAmount = new ArrayList<Double>();

    Double invested = Double.valueOf(0);

    Double profit = Double.valueOf(0);

    
    public Double getInvested() {
        return invested;
    }

    
    public void setInvested(Double invested) {
        this.invested = invested;
    }

    
    public Double getProfit() {
        return profit;
    }

    
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public List<Date> getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(List<Date> txnDate) {
        this.txnDate = txnDate;
    }

    public List<Double> getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(List<Double> txnAmount) {
        this.txnAmount = txnAmount;
    }
}
