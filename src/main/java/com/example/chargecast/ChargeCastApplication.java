package com.example.chargecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ChargeCastApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargeCastApplication.class, args);
    }
}
