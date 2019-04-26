package com.zl.dubbo.demo.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhagnlei
 * @ProjectName: dubbo-demo
 * @create 2019-04-25 21:50
 * @Version: 1.0
 * <p>Copyright: Copyright (zl) 2019</p>
 **/

@SpringBootApplication
public class MainProvide {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        SpringApplication.run(MainProvide.class, args);

    }
}
