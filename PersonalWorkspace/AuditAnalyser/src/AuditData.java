import java.sql.Timestamp;

public class AuditData {

    public static AuditData setEndTime;

    String correlationID;

    Timestamp startTime;

    Timestamp endTime;

    
    public String getCorrelationID() {
        return correlationID;
    }

    
    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
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

}
