package com.skillsoft;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        //Acá demostramos que hasta aunque usemos 2 métodos distintos para obtener el bean del context,
        // como sólo se está inyectando un myIOTDeviceBean, entonces vamos a tener un solo objeto para el myIOTDeviceBean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IOTDevice iotDevice = (IOTDevice) applicationContext.getBean("myIOTDeviceBean");
        IOTDevice iotDevice1 = applicationContext.getBean("myIOTDeviceBean", IOTDevice.class);

        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");

        //Como realmente hay un solo objeto iotdevice para el bean myIOTDevice bean, va a quedar esta información
        //Porque es como si estuvieras modificando la info que se seteó en las líneas de arriba básicamente
        iotDevice1.setDevice("Dishwasher");
        iotDevice1.setDescription("Monitors water flow");

        System.out.println("iotDevice = " + iotDevice);
        System.out.println("iotDevice1 = " + iotDevice1);
    }
}
