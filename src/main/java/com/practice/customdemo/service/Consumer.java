package com.practice.customdemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "SpringDemoTopic", groupId = "mygroup")
    public void consumeFromTopic(String message){
        System.out.println("Message consumed from Topic is : " + message);
    }
}
