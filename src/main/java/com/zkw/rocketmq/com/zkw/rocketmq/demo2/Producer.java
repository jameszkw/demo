package com.zkw.rocketmq.com.zkw.rocketmq.demo2;

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
 * @create 2018-01-12 下午 4:56
 **/

public class Producer {
    public static void main(String[] args) {
        /**
         * 一个应用创建一个Producer，由应用来维护此对象，可以设置为全局对象或者单例<br>
         * 注意：ProducerGroupName需要由应用来保证唯一<br>
         * ProducerGroup这个概念发送普通的消息时，作用不大，但是发送分布式事务消息时，比较关键，
         * 因为服务器会回查这个Group下的任意一个Producer
         */
        DefaultMQProducer producer = new DefaultMQProducer("producer_test");
        //在本地搭建好broker后,记得指定nameServer的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        //        producer.setRetryTimesWhenSendFailed(3); // 发送消息到broker失败，重试次数，默认是2次
        /**
         * Producer对象在使用之前必须要调用start初始化，初始化一次即可<br>
         * 注意：切记不可以在每次发送消息时，都调用start方法
         */
        try {
            producer.start();

        } catch (MQClientException e) {
            e.printStackTrace();
        }

        /**
         * 下面这段代码表明一个Producer对象可以发送多个topic，多个tag的消息。
         * 注意：send方法是同步调用，只要不抛异常就标识成功。但是发送成功也可会有多种状态，<br>
         * 例如消息写入Master成功，但是Slave不成功，这种情况消息属于成功，但是对于个别应用如果对消息可靠性要求极高，<br>
         * 需要对这种情况做处理。另外，消息可能会存在发送失败的情况，失败重试由应用来处理。
         */
        //用一个short标识生产者停止生产数据
        byte [] zero = new  byte[]{0,0};
        Message endMessage = new Message("EndSignal", zero);
        Message msg = new Message("TopicTest1",// topic
                "TagA",// tag
                "OrderID001",// key
                ("Hello MetaQ111").getBytes());// body
        Message msg2 = new Message("TopicTest2",// topic
                "TagB",// tag
                "OrderID0034",// key
                ("Hello MetaQ222").getBytes());// body
        Message msg3 = new Message("TopicTest3",// topic
                "TagC",// tag
                "OrderID0035",// key
                ("Hello MetaQ333").getBytes());// body
        //          SendResult sendResult =  producer.send(msg, timeout);  // 发送消息超时时间配置，默认是3000毫秒

        for(int i=0;i<30;i++){
            Message msgA = new Message("TopicTest1","TagA","OrderID" + i,("Hello MetaQ"+i).getBytes());
            try {
                producer.send(msgA);
            } catch (MQClientException e) {
                e.printStackTrace();
            } catch (RemotingException e) {
                e.printStackTrace();
            } catch (MQBrokerException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("TopicTest1" + "----" + "TagA 发送成功");
        try {
            SendResult sendResult2 = producer.send(msg2);
            System.out.println("TopicTest2" + "----" + "TagB 发送成功");
            SendResult sendResult3 = producer.send(msg3);
            System.out.println("TopicTest3" + "----" + "TagC 发送成功");
            SendResult sendResult_over = producer.send(endMessage);
            System.out.println("EndSignal 发送成功");
        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 应用退出时，要调用shutdown来清理资源，关闭网络连接，从MetaQ服务器上注销自己
         * 注意：我们建议应用在JBOSS、Tomcat等容器的退出钩子里调用shutdown方法
         */
        producer.shutdown();
    }
}
