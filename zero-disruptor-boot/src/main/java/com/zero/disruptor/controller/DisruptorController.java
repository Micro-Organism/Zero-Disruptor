package com.zero.disruptor.controller;

import com.zero.disruptor.common.event.HelloEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/disruptor")
public class DisruptorController {

    HelloEventProducer helloEventProducer;

    @Autowired
    public DisruptorController(HelloEventProducer helloEventProducer) {
        this.helloEventProducer = helloEventProducer;
    }

    @RequestMapping("/send")
    @ResponseBody
    public String add(String message) {
        helloEventProducer.sayHelloMq(message);
        return "success";
    }

}