package dev.mojojo.content_calendar.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyWebConfig {
    @Bean //bean is a method level annotation -> need to under configuration
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}
