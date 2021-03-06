package xirr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import logger.utils.LogHelper;
import main.ReadMFNAV;

public class XirrDate {
    //private static final Logger LOGGER = Logger.getLogger(XirrDate.class.getName());

    public static final double tol = 0.2;

    public static double dateDiff(Date d1, Date d2) {
        long day = 24 * 60 * 60 * 1000;

        return (d1.getTime() - d2.getTime()) / day;
    }

    public static double f_xirr(double p, Date dt, Date dt0, double x) {
        return p * Math.pow((1.0 + x), (dateDiff(dt0, dt) / 365.0));
    }

    /*
     * public static double f_xirr(double p, Date dt, Date dt0, double x) { double exponent = dateDiff(dt0, dt) / 365.0;
     * System.out.println("exponent : " +exponent); System.out.println("x : " +x); double firstArg = 1.0 + x;
     * System.out.println("firstArg : " +x); double pow = Math.pow(firstArg, exponent); System.out.println("pow : " +pow); return p * pow; }
     */

    public static double df_xirr(double p, Date dt, Date dt0, double x) {
        return (1.0 / 365.0) * dateDiff(dt0, dt) * p * Math.pow((x + 1.0), ((dateDiff(dt0, dt) / 365.0) - 1.0));
    }

    public static double total_f_xirr(double[] payments, Date[] days, double x) {
        //LOGGER.info("total_f_xirr");
        double resf = 0.0;

        for (int i = 0; i < payments.length; i++) {
            resf = resf + f_xirr(payments[i], days[i], days[0], x);
        }
        //System.out.println("total_f_xirr resf : " + resf);
        return resf;
    }

    public static double total_df_xirr(double[] payments, Date[] days, double x) {
        //LOGGER.info("total_df_xirr");
        double resf = 0.0;

        for (int i = 0; i < payments.length; i++) {
            resf = resf + df_xirr(payments[i], days[i], days[0], x);
        }
        //System.out.println("total_df_xirr resf : " + resf);
        return resf;
    }

    public static double Newtons_method(Logger LOGGER , double guess, double[] payments, Date[] days) {
        
        //LOGGER.info("Newtons_method");
        double x0 = guess;
        double x1 = 0.0;
        double err = 1e+100;
        //LOGGER.info("err " + err );
        //LOGGER.info("tol " + tol );
        while (err > tol) {
            x1 = x0 - total_f_xirr(payments, days, x0) / total_df_xirr(payments, days, x0);
            err = Math.abs(x1 - x0);
            x0 = x1;
            //LOGGER.info("err " + err );
        }
        /*
         * if (Double.isNaN(x0)) { return Double.valueOf(0); }
         */
        return x0;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static Date strToDate(String str) {
        try {
            return sdf.parse(str);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static void main(String... args) {
        Logger LOGGER = Logger.getLogger(XirrDate.class.getName());
        double[] payments = { -100.0, 200 }; // payments
        Date[] days = { strToDate("01/01/2018"), strToDate("31/06/2018") }; // days of payment (as day of year)
        double xirr = Newtons_method( LOGGER , 0.00001, payments, days);
        System.out.println("XIRR value is " + xirr * 100 + "%");
    }
}