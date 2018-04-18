package com.zkw.rocketmq.com.zkw.rocketmq.demo;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;

/**
 * @description 消息生产者
 *
 * @author James
 * @create 2017-12-23 下午 1:11
 **/

public class Producer {
    /*
     * Constructs a client instance with your account for accessing DefaultMQProducer
     */
    private static DefaultMQProducer producer = new DefaultMQProducer("ProducerGroupName");
    private static int initialState = 0;

    private Producer() {

    }

    public static DefaultMQProducer getDefaultMQProducer(){
        if(producer == null){
            producer = new DefaultMQProducer("ProducerGroupName");
        }
        if(initialState == 0){
            producer.setNamesrvAddr("127.0.0.1:9876");
            try {
                producer.start();
            } catch (MQClientException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

            initialState = 1;
        }

        return producer;
    }
}
