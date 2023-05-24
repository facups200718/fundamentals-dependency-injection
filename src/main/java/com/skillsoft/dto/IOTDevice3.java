package com.skillsoft.dto;

import lombok.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class IOTDevice3 {
    private String device;
    private String description;

    @PostConstruct
    public void initBean() throws Exception {
        System.out.println("IOTDevice bean has been instantiated. Inside the initBean() method.");
    }

    @PreDestroy
    public void destroyBean() throws Exception {
        System.out.println("IOTDevice bean has been destroyed. Inside the destroyBean() method.");
    }
}
