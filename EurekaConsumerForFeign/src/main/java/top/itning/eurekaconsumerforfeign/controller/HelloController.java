package top.itning.eurekaconsumerforfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.itning.eurekaconsumerforfeign.client.EurekaProvider;

@RestController
public class HelloController {
    @Autowired
    private EurekaProvider eurekaProvider;

    @GetMapping("/hello")
    public String hello(String msg) {
        return eurekaProvider.sayHello(msg);
    }
}
