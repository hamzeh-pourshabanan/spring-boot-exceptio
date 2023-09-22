package com.example.springbootexceptio.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class MySimpleMappingExceptionResolver {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties map = new Properties();
        map.put("java.lang.ArithmeticException", "mathError"); //key=exception full name. value, view name
        map.put("java.lang.NullPointerException", "nullPointerError");
        resolver.setExceptionMappings(map);
        return resolver;
    }
}
