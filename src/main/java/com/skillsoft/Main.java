package com.skillsoft;

import com.skillsoft.dto.IOTDevice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        var iotDevice = new IOTDevice();
        System.out.println("iotDevice initialized with a constructor = " + iotDevice);
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        var myIotDevice = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");
        System.out.println("myIotDevice = " + myIotDevice);
    }
}
