public class ReleaseStructure {

    int majorRelease;

    int minorRelease;

    int servicePack;

    int patch;

    int build;

    int swatCoreSP;

    int swatCoreBuild;

    int swatCoreHF;

    int swatGDBuild = 0;

    int swatGDHF = 0;

    int swatDeloitteBuild = 0;

    int swatDeloitteHF = 0;

    String bundleNumber;

    public String getBundleNumber() {
        StringBuilder newBundleNumber = new StringBuilder();
        newBundleNumber.append(majorRelease).append(".");
        newBundleNumber.append(minorRelease).append(".");
        newBundleNumber.append(servicePack).append(".");
        newBundleNumber.append(patch).append(".");
        newBundleNumber.append(build).append(".");
        newBundleNumber.append(swatCoreSP).append(".");
        newBundleNumber.append(swatCoreBuild).append(".");
        newBundleNumber.append(swatCoreHF).append(".");
        newBundleNumber.append(swatGDBuild).append(".");
        newBundleNumber.append(swatGDHF).append(".");
        newBundleNumber.append(swatDeloitteBuild).append(".");
        newBundleNumber.append(swatDeloitteHF);

        bundleNumber = newBundleNumber.toString();
        return bundleNumber;
    }

    public void setBundleNumber(String bundleNumber) {
        this.bundleNumber = bundleNumber;
    }

    public int getMajorRelease() {
        return majorRelease;
    }

    public void setMajorRelease(int majorRelease) {
        this.majorRelease = majorRelease;
    }

    public int getMinorRelease() {
        return minorRelease;
    }

    public void setMinorRelease(int minorRelease) {
        this.minorRelease = minorRelease;
    }

    public int getServicePack() {
        return servicePack;
    }

    public void setServicePack(int servicePack) {
        this.servicePack = servicePack;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    public int getSwatCoreSP() {
        return swatCoreSP;
    }

    public void setSwatCoreSP(int swatCoreSP) {
        this.swatCoreSP = swatCoreSP;
    }

    public int getSwatCoreBuild() {
        return swatCoreBuild;
    }

    public void setSwatCoreBuild(int swatCoreBuild) {
        this.swatCoreBuild = swatCoreBuild;
    }

    public int getSwatCoreHF() {
        return swatCoreHF;
    }

    public void setSwatCoreHF(int swatCoreHF) {
        this.swatCoreHF = swatCoreHF;
    }

    public int getSwatGDBuild() {
        return swatGDBuild;
    }

    public void setSwatGDBuild(int swatGDBuild) {
        this.swatGDBuild = swatGDBuild;
    }

    public int getSwatGDHF() {
        return swatGDHF;
    }

    public void setSwatGDHF(int swatGDHF) {
        this.swatGDHF = swatGDHF;
    }

    public int getSwatDeloitteBuild() {
        return swatDeloitteBuild;
    }

    public void setSwatDeloitteBuild(int swatDeloitteBuild) {
        this.swatDeloitteBuild = swatDeloitteBuild;
    }

    public int getSwatDeloitteHF() {
        return swatDeloitteHF;
    }

    public void setSwatDeloitteHF(int swatDeloitteHF) {
        this.swatDeloitteHF = swatDeloitteHF;
    }

}
