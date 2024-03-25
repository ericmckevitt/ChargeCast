package com.example.chargecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.chargecast.repositories")
public class ChargeCastApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargeCastApplication.class, args);
    }
}
