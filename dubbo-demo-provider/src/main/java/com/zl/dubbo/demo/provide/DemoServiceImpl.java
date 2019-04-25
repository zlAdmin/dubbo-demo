package com.zl.dubbo.demo.provide;

import com.zl.dubbo.demo.DemoService;

/**
 * provide
 *
 * @author zhagnlei
 * @ProjectName: dubbo-demo
 * @create 2019-04-25 21:46
 * @Version: 1.0
 * <p>Copyright: Copyright (zl) 2019</p>
 **/
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello" + name;
    }
}
