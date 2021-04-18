package pojo;

import java.sql.Timestamp;

public class ISOData {
	public String txnRef;
	public Timestamp isoINTime;
	public Timestamp fbeINTime;
	public Timestamp fbeOUTTime;
	public Timestamp isoOUTTime;
	public long isoTimeTaken;
	public long fbeTimeTaken;

	public long getIsoTimeTaken() {
		return isoTimeTaken;
	}

	public void setIsoTimeTaken(long isoTimeTaken) {
		this.isoTimeTaken = isoTimeTaken;
	}

	public long getFbeTimeTaken() {
		return fbeTimeTaken;
	}

	public void setFbeTimeTaken(long fbeTimeTaken) {
		this.fbeTimeTaken = fbeTimeTaken;
	}

	public String getTxnRef() {
		return txnRef;
	}

	public void setTxnRef(String txnRef) {
		this.txnRef = txnRef;
	}

	public Timestamp getIsoINTime() {
		return isoINTime;
	}

	public void setIsoINTime(Timestamp isoINTime) {
		this.isoINTime = isoINTime;
	}

	public Timestamp getFbeINTime() {
		return fbeINTime;
	}

	public void setFbeINTime(Timestamp fbeINTime) {
		this.fbeINTime = fbeINTime;
	}

	public Timestamp getFbeOUTTime() {
		return fbeOUTTime;
	}

	public void setFbeOUTTime(Timestamp fbeOUTTime) {
		this.fbeOUTTime = fbeOUTTime;
	}

	public Timestamp getIsoOUTTime() {
		return isoOUTTime;
	}

	public void setIsoOUTTime(Timestamp isoOUTTime) {
		this.isoOUTTime = isoOUTTime;
	}
}
