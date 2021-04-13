package com.pojo;

public class CodeResource {

    String artefactID;

    String resourceName;

    String checkSum;

    Double versionNumber;

    public Double getVersionNumber() {
        return versionNumber;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public void setVersionNumber(Double versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getArtefactID() {
        return artefactID;
    }

    public void setArtefactID(String artefactID) {
        this.artefactID = artefactID;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

}
