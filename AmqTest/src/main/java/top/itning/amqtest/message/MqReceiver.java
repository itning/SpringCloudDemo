package top.itning.amqtest.message;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收mq方
 *
 * @author wangn
 */
@Component
public class MqReceiver {
    /**
     * RabbitListener queues 接收消息
     * RabbitListener queuesToDeclare 自动创建队列并接收消息 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
     * bindings和exchange 绑定 @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue"), exchange = @Exchange("myExchange")))
     *
     * @param msg 接收的消息
     */
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue1"), exchange = @Exchange("myExchange"), key = "fenzu1"))
    public void receiver(String msg) {
        System.out.println("fenzu1-->" + msg);
    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue2"), exchange = @Exchange("myExchange"), key = "fenzu2"))
    public void receiver2(String msg) {
        System.out.println("fenzu2-->" + msg);
    }
}
