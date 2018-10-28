package com.epam.mentoring.netflix.microservices.customer;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.epam.mentoring.netflix.microservices.customer")
public class CustomerConfiguration {

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

}
