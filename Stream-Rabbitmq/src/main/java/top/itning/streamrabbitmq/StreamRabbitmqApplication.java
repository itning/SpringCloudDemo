package top.itning.streamrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqApplication.class, args);
    }
}
