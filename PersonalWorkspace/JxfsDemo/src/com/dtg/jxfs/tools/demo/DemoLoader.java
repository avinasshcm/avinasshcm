package com.dtg.jxfs.tools.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * The DemoLoader class provides us the list of Demos. The list is obtained from a properties file, having the same name as the service.
 * (Actually JxfsDemoService.properties)
 */
public class DemoLoader {

    public static List getDemos(String service) {
        List demos = new ArrayList();
        try {

            Properties prop = new Properties();
            prop.load(DemoLoader.class.getClassLoader().getResourceAsStream(service.replace('.', '/') + ".properties"));
            Iterator iter = prop.keySet().iterator();
            while (iter.hasNext()) {
                Class cl = Class.forName((String) iter.next());
                demos.add(cl.newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return demos;
    }
}
