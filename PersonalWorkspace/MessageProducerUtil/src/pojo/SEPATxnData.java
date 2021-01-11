package pojo;

public class SEPATxnData {
	String fromAccount;
	String toAccount;
	String toBIC;
	String debitCustomer;
	String txnRef;

	public String getToBIC() {
		return toBIC;
	}

	public void setToBIC(String toBIC) {
		this.toBIC = toBIC;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getDebitCustomer() {
		return debitCustomer;
	}

	public void setDebitCustomer(String debitCustomer) {
		this.debitCustomer = debitCustomer;
	}

	public String getTxnRef() {
		return txnRef;
	}

	public void setTxnRef(String txnRef) {
		this.txnRef = txnRef;
	}
}
