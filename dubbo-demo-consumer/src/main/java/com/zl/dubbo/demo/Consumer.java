package com.zl.dubbo.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhagnlei
 * @ProjectName: dubbo-demo
 * @create 2019-04-25 22:36
 * @Version: 1.0
 * <p>Copyright: Copyright (zl) 2019</p>
 **/
public class Consumer {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);
    }}
