package com.lxl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-rabbitmq-producer.xml" )
public class ProducerTest {
    //    注入RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testHelloWord(){
//        发送消息
        rabbitTemplate.convertAndSend("spring_queue","hello word spring...");
    }

    /**发送fanout消息*/
    @Test
    public void testtestFanout(){
//        发送消息
        rabbitTemplate.convertAndSend("spring_fanout_exchange","","hello word spring-fanout...");
    }

    /**发送topic消息*/
    @Test
    public void testtopic(){
//        发送消息
        rabbitTemplate.convertAndSend("spring_topic_exchange","heima.hh.hr","hello word spring-topic...");
    }




}
