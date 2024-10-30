package com.zero.disruptor;

import com.zero.disruptor.common.event.HelloEventProducer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ZeroDisruptorBootApplicationTests {

    @Autowired
    HelloEventProducer helloEventProducer;

    @BeforeEach
    public void before()  {
        log.info("init some data");
    }

    @AfterEach
    public void after(){
        log.info("clean some data");
    }

    @Test
    public void execute()  {
        log.info("your method test Code");
    }
    /**
     * 项目内部使用Disruptor做消息队列
     * @throws Exception
     */
    @Test
    public void sayHelloMqTest() throws Exception{
        helloEventProducer.sayHelloMq("Hello world!");
        log.info("消息队列已发送完毕");
        //这里停止2000ms是为了确定是处理消息是异步的
        Thread.sleep(2000);
    }

}
