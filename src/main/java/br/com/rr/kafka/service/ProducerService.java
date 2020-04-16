package br.com.rr.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    public void send(String topic, String content) {
        this.template.send(topic, content);
    }
}
