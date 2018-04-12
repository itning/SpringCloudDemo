package top.itning.eurekaconsumerforfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangn
 */
@FeignClient(name = "ep")
@Service
public interface EurekaProvider {
    @GetMapping("/hello")
    String sayHello();
}
