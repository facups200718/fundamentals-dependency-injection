package com.skillsoft;

import com.skillsoft.config.IOTDeviceBeanConfig;
import com.skillsoft.dto.IOTDevice2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);
        IOTDevice2 iotDevice2 = applicationContext.getBean(IOTDevice2.class);
        iotDevice2.setDevice("Fridge");
        iotDevice2.setDescription("Temperature gauge for the freezer");

        System.out.println("iotDevice2 = " + iotDevice2);
    }
}
