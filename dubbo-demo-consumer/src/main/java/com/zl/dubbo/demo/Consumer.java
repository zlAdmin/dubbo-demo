package com.zl.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhagnlei
 * @ProjectName: dubbo-demo
 * @create 2019-04-25 22:36
 * @Version: 1.0
 * <p>Copyright: Copyright (zl) 2019</p>
 **/
@SpringBootApplication
public class Consumer {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        SpringApplication.run(Consumer.class, args);
    }}
