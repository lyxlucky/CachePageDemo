package com.lyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.lyx.dao")
@EnableCaching
public class PageHelperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageHelperDemoApplication.class, args);
    }

}
