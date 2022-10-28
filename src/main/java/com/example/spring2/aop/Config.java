package com.example.spring2.aop;

import com.example.spring2.aop.aspects.ExceptionHandlingAspect;
import com.example.spring2.aop.aspects.LoggingAspectProcessor;
import com.example.spring2.aop.aspects.SecurityAspectProcessor;
import com.example.spring2.aop.aspects.UniversityLoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public UniLibrary uniLibraryBean() {
        return new UniLibrary();
    }

    @Bean
    public SchoolLibrary schoolLibraryBean() { return new SchoolLibrary(); }

    @Bean
    public Book bookBean() { return new Book(); }

    @Bean
    public LoggingAspectProcessor loggingAspectProcessorBean() { return new LoggingAspectProcessor(); }

    @Bean
    public SecurityAspectProcessor securityAspectProcessorBean() { return new SecurityAspectProcessor(); }

    @Bean
    public ExceptionHandlingAspect exceptionHandlingAspectBean() { return new ExceptionHandlingAspect(); }

    @Bean
    public UniversityLoggingAspect universityLoggingAspectBean() { return new UniversityLoggingAspect(); }

    @Bean
    public University universityBean() { return new University(); }
}
