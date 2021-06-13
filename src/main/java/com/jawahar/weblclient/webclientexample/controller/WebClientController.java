package com.jawahar.weblclient.webclientexample.controller;

import com.jawahar.weblclient.webclientexample.model.User;
import com.jawahar.weblclient.webclientexample.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {

    @Autowired
    private WebClient webClient;

    @GetMapping("/learning/user/{id}")
    public Mono<User> getUser(@PathVariable  int id){
        Mono<User> user =  webClient.get().uri("/users/"+id).retrieve().bodyToMono(User.class);
        return user;
    }

    @PostMapping("/learning/user")
    public Mono<String> createUser(@RequestBody UserModel userModel) {
        return webClient.post().uri("/users").syncBody(userModel).retrieve().bodyToMono(String.class);
    }
}
