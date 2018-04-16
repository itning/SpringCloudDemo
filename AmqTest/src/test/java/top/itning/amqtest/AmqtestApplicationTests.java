package top.itning.amqtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqtestApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 根据 routingKey 不同 发送不同的消息
     */
    @Test
    public void sendMqMsg1() {
        amqpTemplate.convertAndSend("myExchange", "fenzu1", "发送的消息->" + new Date());
    }

    /**
     * 根据 routingKey 不同 发送不同的消息
     */
    @Test
    public void sendMqMsg2() {
        amqpTemplate.convertAndSend("myExchange", "fenzu2", "发送的消息->" + new Date());
    }

}
