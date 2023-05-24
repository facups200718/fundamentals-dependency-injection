package com.skillsoft.config;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig4 {
    @Bean(name = "FirstDeviceBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice getFirstIOTDeviceBean() {
        return new IOTDevice();
    }

    @Bean(name = "SecondDeviceBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice getSecondIOTDeviceBean() {
        return new IOTDevice();
    }
}
