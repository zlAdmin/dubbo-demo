package com.zl.dubbo.demo;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglei
 * @ProjectName: dubbo-demo
 * @create 2019-04-26 16:57
 * @Version: 1.0
 * <p>Copyright: Copyright (acmtc) 2019</p>
 **/

@RestController
public class HelloController {

    @Resource
    private DemoConsumerService demoConsumerService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoConsumerService.sayHello(name);
    }
}
