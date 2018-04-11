package top.itning.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.itning.eurekaconsumer.server.HelloServer;

import java.util.UUID;

/**
 * @author wangn
 */
@RestController
public class HelloController {
    private final HelloServer helloServer;

    @Autowired
    public HelloController(HelloServer helloServer) {
        this.helloServer = helloServer;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloServer.hello();
    }
}
