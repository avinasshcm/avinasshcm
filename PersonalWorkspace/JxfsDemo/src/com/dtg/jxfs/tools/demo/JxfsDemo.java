package com.dtg.jxfs.tools.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Class for DEMO Application. Lists all available DEMOS and allows the user to execute them.
 */
public class JxfsDemo {

    private BufferedReader bufIn_ = null;

    private List demos_ = null;

    public static void main(String[] args) {
        JxfsDemo d = new JxfsDemo();
        d.loadDemos();
        int option = d.showDialog();
        while (option != 99) {
            if (option >= 0) {
                JxfsDemoService service = d.getDemo(option);
                System.out.println("========== DESCRIPTION =========");
                System.out.println(service.getDemoDescription());
                System.out.println("========== END DESCRIPTION =========");
                System.out.println("Start Execution of Demo: " + service.getDemoName());
                service.startDemo();
            }
            option = d.showDialog();
        }

        System.out.println("<<<<< JXFS shutdown >>>>>");
        JxfsDemoService.shutdown();
        System.out.println("Exit J/XFS Demo Program");
        System.exit(0);
    }

    public JxfsDemo() {
        bufIn_ = new BufferedReader(new InputStreamReader(System.in));
    }

    public JxfsDemoService getDemo(int i) {
        return (JxfsDemoService) demos_.get(i);
    }

    public void loadDemos() {
        demos_ = DemoLoader.getDemos(JxfsDemoService.class.getName());
    }

    /*
     * Lists the demos and ask the user to insert demo number to run a demo
     */
    public int showDialog() {
        System.out.println(" J/XFS DEMOS");
        System.out.println("=============");
        int i = 0;
        for (i = 0; i < demos_.size(); i++) {
            JxfsDemoService demo = (JxfsDemoService) demos_.get(i);
            System.out.println(i + ". " + demo.getDemoName());
        }
        System.out.println(i + ". Exit");
        System.out.print("Enter demo number: ");

        int option = -1;
        try {
            String str = bufIn_.readLine();
            option = Integer.parseInt(str);
            if (option < 0 && option > i) {
                System.err.println("Invalid option. Try Again.");
                return option;
            } else if (option == i) {
                option = 99;
            }

        } catch (Exception e) {
            System.err.println("Invalid option. Try Again.");
        }

        return option;
    }
}
