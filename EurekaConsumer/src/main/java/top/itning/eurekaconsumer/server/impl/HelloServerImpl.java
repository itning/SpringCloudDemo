package top.itning.eurekaconsumer.server.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.itning.eurekaconsumer.server.HelloServer;

/**
 * @author wangn
 */
@Service
public class HelloServerImpl implements HelloServer {
    private final RestTemplate restTemplate;

    @Autowired
    public HelloServerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String hello(String msg) {
        return restTemplate.getForObject("http://ep/hello?msg=" + msg, String.class);
    }

    @Override
    public String helloFallBack(String msg) {
        return "error";
    }
}
