package com.skillsoft;

import com.skillsoft.config.IOTDeviceBeanConfig5;
import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main12 {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig5.class);

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice iotDevice1 = (IOTDevice) applicationContext.getBean("FridgeBean");
        IOTDevice iotDevice2 = (IOTDevice) applicationContext.getBean("DishwasherBean");
        System.out.println("iotDevice1 = " + iotDevice1);
        System.out.println("iotDevice2 = " + iotDevice2);
        applicationContext.close();
    }
}
