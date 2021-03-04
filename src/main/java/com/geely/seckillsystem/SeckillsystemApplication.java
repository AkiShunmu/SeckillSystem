package com.geely.seckillsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.geely.seckillsystem.pojo.*")
public class SeckillsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillsystemApplication.class, args);
    }

}
