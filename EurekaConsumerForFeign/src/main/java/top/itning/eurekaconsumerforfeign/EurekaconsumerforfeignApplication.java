package top.itning.eurekaconsumerforfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaconsumerforfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerforfeignApplication.class, args);
    }
}
