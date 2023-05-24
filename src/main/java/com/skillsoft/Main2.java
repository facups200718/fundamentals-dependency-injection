package com.skillsoft;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main2 {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");

        DefaultListableBeanFactory beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(resource);

        IOTDevice myDeviceBean = (IOTDevice) beanDefinitionRegistry.getBean("myIOTDeviceBean");

        System.out.println("myDeviceBean = " + myDeviceBean);
    }
}
