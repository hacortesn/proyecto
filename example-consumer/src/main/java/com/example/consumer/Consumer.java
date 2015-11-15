package com.example.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by familia on 14/11/2015.
 */
public class Consumer {

    public static void main(final String... args) throws Exception {

        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:context.xml");
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
        while (true) {
            //template.convertAndSend("Hello, world!");
            Thread.sleep(1000);
        }
        //ctx.destroy();
    }
}
