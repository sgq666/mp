package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mp.mapper")
@SpringBootApplication


public class MpAplication {
    public static void main(String[] args) {
        SpringApplication.run(MpAplication.class, args);
    }
}