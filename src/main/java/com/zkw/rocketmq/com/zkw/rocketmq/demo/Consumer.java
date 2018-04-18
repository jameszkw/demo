package com.zkw.rocketmq.com.zkw.rocketmq.demo;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;

/**
 * @description 消息消费者
 *
 * @author James
 * @create 2017-12-23 下午 1:13
 **/

public class Consumer {
    /*
     * Constructs a client instance with your account for accessing DefaultMQConsumer
     */
    private static DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ConsumerGroupName");
    private static int initialState = 0;

    private Consumer() {

    }
    public static DefaultMQPushConsumer getDefaultMQPushConsumer(){
        if(consumer == null){
            consumer = new DefaultMQPushConsumer("ConsumerGroupName");
        }

        if(initialState == 0){
            consumer.setNamesrvAddr("127.0.0.1:9876");
            consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
            initialState = 1;
        }

        return consumer;
    }
}
