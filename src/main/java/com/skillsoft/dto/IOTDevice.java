package com.skillsoft.dto;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class IOTDevice {
    public IOTDevice() {
        System.out.println("The bean has been created");
    }
    private String device = "Air Conditioner";
    private String description = "Temperature sensor";

    public void initBean() throws Exception {
        System.out.println("IOTDevice bean has been instantiated. Inside the initBean() method.");
    }

    public void destroyBean() throws Exception {
        System.out.println("IOTDevice bean has been destroyed. Inside the destroyBean() method.");
    }
}
