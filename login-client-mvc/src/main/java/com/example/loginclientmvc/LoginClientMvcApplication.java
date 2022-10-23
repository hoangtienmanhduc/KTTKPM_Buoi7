package com.example.loginclientmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LoginClientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginClientMvcApplication.class, args);
    }

}
