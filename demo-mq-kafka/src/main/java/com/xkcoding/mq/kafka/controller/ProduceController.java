package com.xkcoding.mq.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qsmy
 */
@RestController
public class ProduceController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/kafka/send")
    public void sed(@RequestParam String topic, @RequestParam String msg) {
        kafkaTemplate.send(topic, msg);
    }
}
