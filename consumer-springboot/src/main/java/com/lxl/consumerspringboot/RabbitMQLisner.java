package com.lxl.consumerspringboot;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class RabbitMQLisner {


    @RabbitListener(queues = "boot_queue")
    public void LisenerQueue(Message message){
        System.out.println(new String(message.getBody()));
    }
}
