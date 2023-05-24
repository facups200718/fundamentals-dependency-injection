package com.skillsoft.config;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig3 {
    @Bean(name = "SomeDeviceBean")
    public IOTDevice IOTDeviceBean() {
        return new IOTDevice();
    }
}
