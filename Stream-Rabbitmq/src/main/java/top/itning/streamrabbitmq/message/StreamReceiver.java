package top.itning.streamrabbitmq.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收
 *
 * @author wangn
 */
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT)
    public void receiver(String msg) {
        System.out.println("INPUT->" + msg);
    }
}
