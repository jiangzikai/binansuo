package com.kaihang.binansuo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//添加对mapper的自动扫描
@MapperScan(value = "com.kaihang.binansuo.dao.mapper")
@SpringBootApplication
public class BinansuoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinansuoApplication.class, args);
    }

}
