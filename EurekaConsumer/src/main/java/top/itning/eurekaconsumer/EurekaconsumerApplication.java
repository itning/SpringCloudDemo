package top.itning.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
public class EurekaconsumerApplication {
    /**
     * LoadBalanced 注解用于使用应用名进行查找,并负载均衡
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaconsumerApplication.class, args);
    }
}
