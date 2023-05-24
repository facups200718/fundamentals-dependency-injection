package com.skillsoft;

import com.skillsoft.config.IOTDeviceBeanConfig2;
import com.skillsoft.dto.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig2.class);
        //IOTDeviceBean es el nombre del método en IOTDeviceBeanConfig2
        //Hay que poner eso A MENOS QUE SE MODIFIQUE EL NOMBRE COMO EN EL IOTDeviceBeanConfig3
        IOTDevice iotDevice = (IOTDevice) applicationContext.getBean("IOTDeviceBean");
        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");
        System.out.println("iotDevice = " + iotDevice);
    }
}
