package com.minutes.microservices.limitsservices.controller.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {

    private int minimum;
    private int maximun;
}
