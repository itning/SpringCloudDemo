package top.itning.eurekaconsumerforconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.itning.eurekaconsumerforconfig.client.EurekaProvider;

/**
 * @author wangn
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${ddd}")
    private String profile;

    @Autowired
    private EurekaProvider eurekaProvider;

    @GetMapping("/hello")
    public String hello(String msg) {
        return profile + "->" + eurekaProvider.sayHello(msg);
    }
}
