package com.zkw.concurrent.conparttern;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public class Consumer implements Runnable {
    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    public void run() {
        System.out.println("start consumer id="+Thread.currentThread().getId());
        Random r = new Random();

        try{
            while (true){
                PCData data = queue.take();
                if (data != null){
                    int re = data.getIntData()*data.getIntData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}",data.getIntData(),data.getIntData(),re));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
