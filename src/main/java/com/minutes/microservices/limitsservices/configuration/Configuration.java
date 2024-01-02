package com.minutes.microservices.limitsservices.configuration;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {

    private int minimum;
    private int maximum;
}
