package com.zero.disruptor.common.event;

import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.RingBuffer;
import com.zero.disruptor.common.model.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloEventProducer {
    @Autowired
    RingBuffer<MessageModel> ringBuffer;
    public synchronized void sayHelloMq(String message){
        EventTranslator<MessageModel> et = new EventTranslator<MessageModel>() {
            @Override
            public void translateTo(MessageModel messageModel, long l) {
                messageModel.setMessage(message);
            }
        };
        ringBuffer.publishEvent(et);
    }

}
