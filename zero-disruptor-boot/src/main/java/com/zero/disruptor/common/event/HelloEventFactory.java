package com.zero.disruptor.common.event;

import com.lmax.disruptor.EventFactory;
import com.zero.disruptor.common.model.MessageModel;

public class HelloEventFactory implements EventFactory<MessageModel> {
    @Override
    public MessageModel newInstance() {
        return new MessageModel();
    }
}
