package com.skillsoft;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main10 {
    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice iotDevice1 = (IOTDevice) applicationContext.getBean("myIOTDeviceBeanOne");
        IOTDevice iotDevice2 = (IOTDevice) applicationContext.getBean("myIOTDeviceBeanTwo");

        iotDevice1.setDevice("Fridge");
        iotDevice1.setDescription("Temperature gauge for the freezer");

        iotDevice2.setDevice("Dishwasher");
        iotDevice2.setDescription("Monitors water flow");

        System.out.println("iotDevice1 = " + iotDevice1);
        System.out.println("iotDevice2 = " + iotDevice2);

        applicationContext.close();
    }
}
