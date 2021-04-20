package pojo;

import java.sql.Timestamp;

public class WebServiceData {
	public String correlationID;
	public String serviceName;
	public Timestamp startTime;
	public Timestamp endTime;
	public String invocationMode;
	public String status;
	public String threadID;
	public long timeTaken;
	public String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public long getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
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

	public String getInvocationMode() {
		return invocationMode;
	}

	public void setInvocationMode(String invocationMode) {
		this.invocationMode = invocationMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThreadID() {
		return threadID;
	}

	public void setThreadID(String threadID) {
		this.threadID = threadID;
	}
}
