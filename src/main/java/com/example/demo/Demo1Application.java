package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lse0101 on 2015. 1. 21..
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Demo1Application {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
}

