package com.skillsoft;

import com.skillsoft.dto.IOTDevice3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main13 {
    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice3 iotDevice1 = (IOTDevice3) applicationContext.getBean("FridgeBean");
        IOTDevice3 iotDevice2 = (IOTDevice3) applicationContext.getBean("DishwasherBean");

        System.out.println("iotDevice1 = " + iotDevice1);
        System.out.println("iotDevice2 = " + iotDevice2);
        applicationContext.close();
    }
}
