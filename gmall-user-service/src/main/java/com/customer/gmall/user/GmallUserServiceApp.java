package com.customer.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * GmallUserServiceApp
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
@SpringBootApplication
@MapperScan("com.customer.gmall.user.mapper")
@EnableDubbo
public class GmallUserServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApp.class, args);
    }

}
