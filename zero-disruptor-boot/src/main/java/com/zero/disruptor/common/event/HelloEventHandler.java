package com.zero.disruptor.common.event;

import com.lmax.disruptor.EventHandler;
import com.zero.disruptor.common.model.MessageModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloEventHandler implements EventHandler<MessageModel> {
    @Override
    public void onEvent(MessageModel event, long sequence, boolean endOfBatch) {
        try {

            Thread.sleep(1000);
            log.info("consume message start");
            if (event != null) {
                log.info("the message is：{}",event);
            }
        } catch (Exception e) {
            log.info("consume message fail");
        }
        log.info("consume message ending");
    }
}
