package top.itning.eurekaconsumerforconfig.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangn
 */
@FeignClient(name = "ep")
@Component
public interface EurekaProvider {
    @GetMapping("/hello")
    String sayHello(@RequestParam("msg") String msg);
}
