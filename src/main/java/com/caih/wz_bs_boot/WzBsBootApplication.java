package com.caih.wz_bs_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//jar包运行主程序
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class WzBsBootApplication{

    public static void main(String[] args) {
        SpringApplication.run(WzBsBootApplication.class, args);
    }
}

//war包运行主程序
//@SpringBootApplication
//@EnableAsync
//@EnableScheduling
//public class WzBsBootApplication  extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(WzBsBootApplication.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(WzBsBootApplication.class, args);
//    }
//}
