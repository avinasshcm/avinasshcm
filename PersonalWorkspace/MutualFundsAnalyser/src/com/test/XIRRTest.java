package com.test;

import java.util.Date;

import xirr.XirrDate;

public class XIRRTest {

    public static void main(String args[]) {

        double[] payments = {   
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
								-20000,
                                596000                                };
        Date[] days = { 
						new Date(2018, 01, 01),
						new Date(2018, 02, 01),
						new Date(2018, 03, 01),
						new Date(2018, 04, 01),
						new Date(2018, 05, 01),
						new Date(2018, 06, 01),
						new Date(2018, 07, 01),
						new Date(2018, 07, 01),
						new Date(2018, 07, 01),
						new Date(2018, 10, 01),
						new Date(2018, 11, 01),
						new Date(2018, 12, 01),						
						new Date(2019, 01, 01),
						new Date(2019, 02, 01),
						new Date(2019, 03, 01),
						new Date(2019, 04, 01),
						new Date(2019, 05, 01),
						new Date(2019, 06, 01),
						new Date(2019, 07, 01),
						new Date(2019, 07, 01),
						new Date(2019, 07, 01),
						new Date(2019, 10, 01),
						new Date(2019, 11, 01),
						new Date(2019, 12, 01),
						
                        new Date(2020, 01, 01)};
        System.out.println(/*XirrDate.Newtons_method(LOGGER, 0.1, payments, days)*100 + "%"*/);
    }
}
