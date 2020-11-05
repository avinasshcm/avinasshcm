package dd.perf;

public class TxnInfo {
	String InstructionID;
	String EndToEndID;
	String CreditorIdentifier;
	String CreditorAccount;
	String DebitorAccount;
	
	
	public String getInstructionID() {
		return InstructionID;
	}
	public void setInstructionID(String instructionID) {
		InstructionID = instructionID;
	}
	public String getEndToEndID() {
		return EndToEndID;
	}
	public void setEndToEndID(String endToEndID) {
		EndToEndID = endToEndID;
	}
	public String getCreditorIdentifier() {
		return CreditorIdentifier;
	}
	public void setCreditorIdentifier(String creditorIdentifier) {
		CreditorIdentifier = creditorIdentifier;
	}
	public String getCreditorAccount() {
		return CreditorAccount;
	}
	public void setCreditorAccount(String creditorAccount) {
		CreditorAccount = creditorAccount;
	}
	public String getDebitorAccount() {
		return DebitorAccount;
	}
	public void setDebitorAccount(String debitorAccount) {
		DebitorAccount = debitorAccount;
	}
}
