package top.itning.streamrabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.itning.streamrabbitmq.message.StreamClient;

import java.util.Date;

@RestController
@EnableBinding(StreamClient.class)
public class TestController {
    @Autowired
    private StreamClient streamClient;

    @GetMapping("/a")
    public void hello(){
        streamClient.output().send(MessageBuilder.withPayload("发送->" + new Date()).build());
    }
}
