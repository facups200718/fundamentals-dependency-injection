package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        //El objeto se instancia acá, porque nosotros lo indicamos en el applicationContext.xml
        //OJO, con BeanFactory es distinto, porque BeanFactory sólo sirve para encontrar el bean, pero NO se instancia automáticamente, en ese caso se instancia cuando hacemos el getBean()
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Acá NO se instancia, sino que simplemente obtenemos la instancia y la asignamos a una variable
        IOTDevice myDeviceBean = (IOTDevice) applicationContext.getBean("myIOTDeviceBean");

        System.out.println("myDeviceBean = " + myDeviceBean);
    }
}
