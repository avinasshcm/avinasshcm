package pojo;

import java.sql.Timestamp;

public class AuditData {
	public String correlationID;
	public String serviceName;
	public Timestamp startTime;
	public Timestamp endTime;
	public Timestamp txnDateTime;
	public String txnCode;
	public String txnRef;
	public String msgFunction;

	public String getTxnRef() {
		return txnRef;
	}

	public String getMsgFunction() {
		return msgFunction;
	}

	public void setMsgFunction(String msgFunction) {
		this.msgFunction = msgFunction;
	}

	public void setTxnRef(String txnRef) {
		this.txnRef = txnRef;
	}

	String threadID;

	public String getThreadID() {
		return threadID;
	}

	public void setThreadID(String threadID) {
		this.threadID = threadID;
	}

	public String getTxnCode() {
		return txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public Timestamp getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(Timestamp txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
}
