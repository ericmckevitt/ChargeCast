package com.example.chargecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ChargeCastApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargeCastApplication.class, args);
    }

    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, World!!!";
        }
    }
}
