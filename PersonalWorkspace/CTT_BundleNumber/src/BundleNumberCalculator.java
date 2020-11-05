import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class BundleNumberCalculator {

    private static final Logger LOGGER = Logger.getLogger(BundleNumberCalculator.class.getName());

    XmlBeanFactory factory = CurrentBuildProviderBeanFactory.getFactory();

    CurrentBuildProvider currentBuildProvider = (CurrentBuildProvider) factory.getBean("CURRENT_BUILD_PROVIDER");

    String UB_Full_Build;

    public BundleNumberCalculator(int option) {
        UB_Full_Build = currentBuildProvider.getUB_Full_Build();

        System.out.println("Active Bundle : " + UB_Full_Build);

        String[] release = UB_Full_Build.split("\\.");
        ReleaseStructure rs = new ReleaseStructure();
        rs.setMajorRelease(Integer.valueOf(release[0]));
        rs.setMinorRelease(Integer.valueOf(release[1]));
        rs.setServicePack(Integer.valueOf(release[2]));
        rs.setPatch(Integer.valueOf(release[3]));

        rs.setBuild(Integer.valueOf(release[4]));

        if (release.length == 12) {
            rs.setSwatDeloitteBuild(Integer.valueOf(release[10]));
            rs.setSwatDeloitteHF(Integer.valueOf(release[11]));
        }

        if (release.length == 10) {
            rs.setSwatGDBuild(Integer.valueOf(release[8]));
            rs.setSwatGDHF(Integer.valueOf(release[9]));
        }

        rs.setSwatCoreSP(Integer.valueOf(release[5]));
        rs.setSwatCoreBuild(Integer.valueOf(release[6]));
        rs.setSwatCoreHF(Integer.valueOf(release[7]));

        if (option == 1) {
            rs.setSwatDeloitteBuild(rs.getSwatDeloitteBuild() + 1);
        } else {
            rs.setSwatDeloitteHF(rs.getSwatDeloitteHF() + 1);
        }
        System.out.println("New Bundle Number should be : " + rs.getBundleNumber());
    }

    public static void main(String args[]) {

        System.out.println("\n\nYou are about to Generate Build Number for Deloitte delivery.");
        System.out.println("Select your option from the list below.");
        System.out.println("...............................................");
        System.out.println("1 - Patch");
        System.out.println("2 - HotFix");
        System.out.println("0 - EXIT");
        System.out.print("\nEnter Your Option : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        try {
            option = Integer.valueOf(br.readLine());
        } catch (IOException ioe) {
            LOGGER.severe("IO error trying to read Input!");
            // System.exit(1);
        }

        BundleNumberCalculator rcb = new BundleNumberCalculator(option);

    }
}
