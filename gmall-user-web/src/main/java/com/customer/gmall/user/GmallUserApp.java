package com.customer.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * GmallUserApp
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
@SpringBootApplication
@EnableDubbo
public class GmallUserApp {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApp.class, args);
    }

}
