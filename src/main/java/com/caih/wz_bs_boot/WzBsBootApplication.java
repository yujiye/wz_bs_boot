package com.caih.wz_bs_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class WzBsBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzBsBootApplication.class, args);
    }
}
