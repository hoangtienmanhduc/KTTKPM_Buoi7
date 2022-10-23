package com.example.loginclientmvc.controller;

import com.example.loginclientmvc.entity.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    RestTemplate restTemplate = new RestTemplate();
    @PostMapping("/register")
    public User register(@RequestBody User user){

        return restTemplate.postForObject("http://localhost:8080/register",user,User.class);
    }
    @PostMapping("/login")
    public User login(@RequestBody User user){

        return restTemplate.postForObject("http://localhost:8080/login",user,User.class);
    }
    @GetMapping("/getUser")
    public User getUser(@RequestBody User user){

        return restTemplate.postForObject("http://localhost:8080/getUser",user,User.class);
    }
}
