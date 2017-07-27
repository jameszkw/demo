package com.zkw.concurrent.conparttern;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public class Producter implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;
    private static AtomicInteger count = new AtomicInteger();

    public Producter(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    public void run() {
        PCData data = null;
        Random r = new Random();
        System.out.println("start producter id="+Thread.currentThread().getId());
        try {
            while (isRunning){
                Thread.sleep(r.nextInt(SLEEPTIME));
                data = new PCData(count.incrementAndGet());
                System.out.println(data +" is put into queue");
                if (!queue.offer(data,2, TimeUnit.SECONDS)){
                    System.out.println("failed to put data: "+data);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop(){
        isRunning = false;
    }
}
