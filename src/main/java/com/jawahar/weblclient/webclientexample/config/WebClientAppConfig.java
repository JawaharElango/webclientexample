package com.jawahar.weblclient.webclientexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientAppConfig {

    @Bean
    public WebClient webCient() {
        return WebClient.builder().baseUrl("https://reqres.in/api").defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();

    }
}
