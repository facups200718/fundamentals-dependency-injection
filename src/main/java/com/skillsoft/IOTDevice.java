package com.skillsoft;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IOTDevice {
    private String device = "Air Conditioner";
    private String description = "Temperature sensor";
}
