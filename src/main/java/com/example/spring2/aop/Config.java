package com.example.spring2.aop;

import com.example.spring2.aop.aspects.LoggingAspectProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Library libraryBean() {
        return new Library();
    }

    @Bean
    public LoggingAspectProcessor loggingAspectProcessorBean() { return new LoggingAspectProcessor(); }
}
