package com.zkw.conparttern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public class ProductCustomerMain {

    public static void main(String[] args) {
        //建立缓存区
        BlockingQueue<PCData> queue = new LinkedBlockingQueue<PCData>(10);
        Producter producter1=new Producter(queue);
        Producter producter2=new Producter(queue);
        Producter producter3=new Producter(queue);
        Consumer consumer1=new Consumer(queue);
        Consumer consumer2=new Consumer(queue);
        Consumer consumer3=new Consumer(queue);

        ExecutorService exe= Executors.newCachedThreadPool();
        exe.execute(producter1);
        exe.execute(producter2);
        exe.execute(producter3);
        exe.execute(consumer1);
        exe.execute(consumer2);
        exe.execute(consumer3);
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producter1.stop();
        producter2.stop();
        producter3.stop();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exe.shutdown();
    }
}
