package com.example.spring2.ioc_di.independently;

import com.example.spring2.ioc_di.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class Config2 {

    @Bean
    public Part engineBean() {
        return new Engine();
    }

    @Bean
    public Part transmissionBean() {
        return new Transmission();
    }

    @Bean
    public Part suspensionBean() {
        return new Suspension();
    }

    @Bean
    public Car carBean() {
        return new Car((Engine) engineBean(), (Transmission) transmissionBean(), (Suspension) suspensionBean());
    }
}
