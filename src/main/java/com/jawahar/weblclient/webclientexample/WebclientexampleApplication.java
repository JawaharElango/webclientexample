package com.jawahar.weblclient.webclientexample;

import com.jawahar.weblclient.webclientexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class WebclientexampleApplication {

public static void main(String[] args) {
		SpringApplication.run(WebclientexampleApplication.class, args);
	}

}
