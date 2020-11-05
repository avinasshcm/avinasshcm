package com.avi;

public class Break {

    private static final CharSequence KSMConstant = "KSM";

    private static final CharSequence CSMConstant = "CSM";

    private static final CharSequence USMConstant = "USM";

    public static void main(String[] args) {
        String hostParam = "Account is Dormant";

        for (int i = 0; i < 5; i++)
            if (hostParam.contains(KSMConstant)) {
                System.out.println("KSM");
            } else if (hostParam.contains(CSMConstant)) {
                System.out.println("CSM");
            } else {
                if (!hostParam.contains(USMConstant)) {
                    System.out.println("USM before Break");
                    break;
                }
                System.out.println("USM");
            }

    }

}
