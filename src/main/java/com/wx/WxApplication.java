package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.wx.mapper")
@EnableCaching
public class WxApplication {

    public static void main(String[] args){

        SpringApplication.run(WxApplication.class, args);

    }

}
