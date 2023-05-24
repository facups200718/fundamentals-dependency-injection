package com.skillsoft.config;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig2 {
    @Bean
    public IOTDevice IOTDeviceBean() {
        return new IOTDevice();
    }
}
