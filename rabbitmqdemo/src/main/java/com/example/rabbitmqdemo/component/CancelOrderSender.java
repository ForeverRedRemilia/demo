package com.example.rabbitmqdemo.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CancelOrderSender {

    @Autowired
    private AmqpTemplate amqpTemplate;



}
