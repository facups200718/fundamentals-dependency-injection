package com.skillsoft.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.stereotype.Component;

//Un component es una clase cuyas instancias se pueden inyectar en otro objeto
@Component
@Data
@ToString
@EqualsAndHashCode
public class IOTDevice2 {
    private String device = "Air Conditioner";
    private String description = "Temperature sensor";
}
