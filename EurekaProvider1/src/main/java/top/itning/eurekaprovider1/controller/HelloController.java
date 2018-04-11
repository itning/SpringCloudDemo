package top.itning.eurekaprovider1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author wangn
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "pro1->" + UUID.randomUUID().toString();
    }
}
