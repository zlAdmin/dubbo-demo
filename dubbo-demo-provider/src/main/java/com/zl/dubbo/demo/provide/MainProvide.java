package com.zl.dubbo.demo.provide;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhagnlei
 * @ProjectName: dubbo-demo
 * @create 2019-04-25 21:50
 * @Version: 1.0
 * <p>Copyright: Copyright (zl) 2019</p>
 **/
public class MainProvide {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
