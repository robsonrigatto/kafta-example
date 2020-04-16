package br.com.rr.kafka.controller;

import br.com.rr.kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/topic/{topic}/send/{content}")
    public void send(@PathVariable String topic, @PathVariable String content) {
        producerService.send(topic, content);
    }
}
