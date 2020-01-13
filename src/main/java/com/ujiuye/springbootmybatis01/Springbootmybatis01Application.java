package com.ujiuye.springbootmybatis01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ujiuye.springbootmybatis01.dao")
public class Springbootmybatis01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootmybatis01Application.class, args);
    }

}
