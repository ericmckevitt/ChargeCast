package com.example.chargecast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SurchargeController {
    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, World!!!";
        }
    }
}
