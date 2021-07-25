package com.practice.customdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Publisher {
    public static final String TOPIC = "SpringDemoTopic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publishToTopic(String message){
        this.kafkaTemplate.send(TOPIC, message);
        System.out.println("Message published to Kafka Topic");
    }
}
