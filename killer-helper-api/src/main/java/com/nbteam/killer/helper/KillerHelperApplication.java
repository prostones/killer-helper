package com.nbteam.killer.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nbteam.killer.helper"})
public class KillerHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(KillerHelperApplication.class, args);
    }

}
