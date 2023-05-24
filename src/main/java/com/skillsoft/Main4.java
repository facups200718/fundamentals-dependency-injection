package com.skillsoft;

import com.skillsoft.dto.IOTDevice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        //Acá demostramos que ApplicationContext es hijo de BeanFactory
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext;
        IOTDevice iotDevice = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
        System.out.println("iotDevice = " + iotDevice);
    }
}
