package top.itning.eurekaprovider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangn
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String msg) {
        return "pro2->" + msg + "--" + UUID.randomUUID().toString();
    }
}
