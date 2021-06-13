package com.jawahar.weblclient.webclientexample.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @JsonProperty("data")
    private UserData data;
    private Support support;
}
