package com.minutes.microservices.limitsservices.controller;

import com.minutes.microservices.limitsservices.configuration.Configuration;
import com.minutes.microservices.limitsservices.controller.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());

    }
}
