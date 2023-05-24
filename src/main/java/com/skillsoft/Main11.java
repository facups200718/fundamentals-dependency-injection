package com.skillsoft;

import com.skillsoft.config.IOTDeviceBeanConfig4;
import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main11 {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig4.class);

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice iotDevice1 = (IOTDevice) applicationContext.getBean("FirstDeviceBean");
        IOTDevice iotDevice2 = (IOTDevice) applicationContext.getBean("SecondDeviceBean");

        iotDevice1.setDevice("Fridge");
        iotDevice1.setDescription("Temperature gauge for the freezer");

        iotDevice2.setDevice("Dishwasher");
        iotDevice2.setDescription("Monitors water flow");

        System.out.println("iotDevice1 = " + iotDevice1);
        System.out.println("iotDevice2 = " + iotDevice2);

        applicationContext.close();
    }
}
