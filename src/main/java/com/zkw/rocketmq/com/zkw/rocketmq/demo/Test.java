package com.zkw.rocketmq.com.zkw.rocketmq.demo;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 创建生产和消费服务
 *
 * @author James
 * @create 2017-12-23 下午 1:15
 **/

public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args){
        sendMsg();
//        receiveMsg();
    }

    public static void sendMsg(){
        // 获取消息生产者
        DefaultMQProducer producer = Producer.getDefaultMQProducer();
        for(int i=0;i<2000;i++){
            Message msg = new Message(
                    "TopicTest1",                   // topic
                    "TagA",                         // tag
                    "OrderID00"+i,                  // key
                    ("Hello MetaQ"+i).getBytes());  // body
            try {
                SendResult sendResult = producer.send(msg);
            } catch (MQClientException e) {
                e.printStackTrace();
            } catch (RemotingException e) {
                e.printStackTrace();
            } catch (MQBrokerException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //logger.info("sendResult:{}", sendResult);
        }
        producer.shutdown();
    }

    public static void receiveMsg(){
        // 获取消息生产者
        DefaultMQPushConsumer consumer = Consumer.getDefaultMQPushConsumer();
        // 订阅主体
        try {
            consumer.subscribe("TopicTest1", "*");
            consumer.registerMessageListener(new MessageListenerConcurrently() {
                /**
                 * * 默认msgs里只有一条消息，可以通过设置consumeMessageBatchMaxSize参数来批量接收消息
                 */
                public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                    logger.info("currentThreadName:{} and Receive New Messages:{}",Thread.currentThread().getName(),msgs);
                    MessageExt msg = msgs.get(0);
                    if (msg.getTopic().equals("TopicTest1")) {
                        // 执行TopicTest1的消费逻辑
                        if (msg.getTags() != null && msg.getTags().equals("TagA")) {
                            // 执行TagA的消费
                            logger.info("MsgBody:{}",new String(msg.getBody()));
                        } else if (msg.getTags() != null
                                && msg.getTags().equals("TagC")) {
                            // 执行TagC的消费
                        } else if (msg.getTags() != null
                                && msg.getTags().equals("TagD")) {
                            // 执行TagD的消费
                        }
                    }else if (msg.getTopic().equals("TopicTest2")) {
                        // 执行TopicTest2的消费逻辑
                    }
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
            });
            /**
             * Consumer对象在使用之前必须要调用start初始化，初始化一次即可<br>
             */
            consumer.start();

            logger.info("Consumer Started.");
        } catch (MQClientException e) {
            e.printStackTrace();
        }
    }
}
