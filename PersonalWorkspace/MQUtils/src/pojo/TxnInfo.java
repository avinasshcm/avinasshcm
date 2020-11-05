package pojo;

public class TxnInfo
{
  String InstructionID;
  String EndToEndID;
  String CreditorIdentifier;
  String CreditorAccount;
  String DebitorAccount;

  public String getInstructionID()
  {
    return this.InstructionID;
  }
  public void setInstructionID(String instructionID) {
    this.InstructionID = instructionID;
  }
  public String getEndToEndID() {
    return this.EndToEndID;
  }
  public void setEndToEndID(String endToEndID) {
    this.EndToEndID = endToEndID;
  }
  public String getCreditorIdentifier() {
    return this.CreditorIdentifier;
  }
  public void setCreditorIdentifier(String creditorIdentifier) {
    this.CreditorIdentifier = creditorIdentifier;
  }
  public String getCreditorAccount() {
    return this.CreditorAccount;
  }
  public void setCreditorAccount(String creditorAccount) {
    this.CreditorAccount = creditorAccount;
  }
  public String getDebitorAccount() {
    return this.DebitorAccount;
  }
  public void setDebitorAccount(String debitorAccount) {
    this.DebitorAccount = debitorAccount;
  }
}