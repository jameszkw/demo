package com.zkw.rocketmq.com.zkw.rocketmq.demo1;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-12-23 下午 2:30
 **/

public class Producer {
    public static void main(String[] args){
        DefaultMQProducer producer = new DefaultMQProducer("Producer");
        producer.setNamesrvAddr("127.0.0.1:9876");
        try {
            producer.start();
            /*for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                Message msg = new Message("PushTopic",
                        "push",
                        "1",
                        "Just for test.".getBytes());

                SendResult result = producer.send(msg);
                System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());
            }*/
            Message msg = new Message("TopicTest1",
                    "TagA",
                    "1",
                    "Just for test.".getBytes());

            SendResult result = producer.send(msg);
            System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());


        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }

}
