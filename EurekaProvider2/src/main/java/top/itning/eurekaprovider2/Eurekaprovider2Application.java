package top.itning.eurekaprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaprovider2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaprovider2Application.class, args);
    }
}
