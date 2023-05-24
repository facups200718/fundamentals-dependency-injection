package com.skillsoft.config;

import com.skillsoft.dto.IOTDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig5 {
    //Se pre-instancian los beans acá
    @Bean(name = "FridgeBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice getFirstIOTDeviceBean() {
        return IOTDevice.builder()
                .device("Fridge")
                .description("Temperature gauge for the freezer")
                .build();
    }

    @Bean(name = "DishwasherBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice getSecondIOTDeviceBean() {
        return IOTDevice.builder()
                .device("Dishwasher")
                .description("Monitors water flow")
                .build();
    }
}
