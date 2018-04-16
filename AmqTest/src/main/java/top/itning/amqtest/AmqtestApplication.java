package top.itning.amqtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AmqtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmqtestApplication.class, args);
    }
}
