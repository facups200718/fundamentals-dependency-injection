package com.skillsoft;

import com.skillsoft.config.IOTDeviceBeanConfig2;
import com.skillsoft.dto.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main9 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig2.class);
        IOTDevice iotDevice = (IOTDevice) applicationContext.getBean("SomeDeviceBean");
        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");
        System.out.println("iotDevice = " + iotDevice);
    }
}
