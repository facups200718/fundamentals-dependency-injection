package com.skillsoft;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Acá hacemos lo que tendríamos que hacer para evitar lo que nos pasa en el Main5.java
public class Main6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Inyectamos un bean distinto para cada objeto
        IOTDevice iotDevice = (IOTDevice) applicationContext.getBean("myIOTDeviceBeanOne");
        IOTDevice iotDevice1 = applicationContext.getBean("myIOTDeviceBeanTwo", IOTDevice.class);

        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");

        iotDevice1.setDevice("Dishwasher");
        iotDevice1.setDescription("Monitors water flow");

        System.out.println("iotDevice = " + iotDevice);
        System.out.println("iotDevice1 = " + iotDevice1);
    }
}
