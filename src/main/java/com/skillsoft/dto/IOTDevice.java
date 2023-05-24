package com.skillsoft.dto;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
public class IOTDevice {
    public IOTDevice() {
        System.out.println("The bean has been created");
    }
    private String device = "Air Conditioner";
    private String description = "Temperature sensor";
}
