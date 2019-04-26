package com.zl.dubbo.demo;

import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;

/**
 * Controller测试、
 *
 * @author zhanglei
 * @ProjectName: dubbo-demo
 * @create 2019-04-26 16:55
 * @Version: 1.0
 * <p>Copyright: Copyright (acmtc) 2019</p>
 **/

@Service
public class DemoConsumerService {

    @Reference
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
