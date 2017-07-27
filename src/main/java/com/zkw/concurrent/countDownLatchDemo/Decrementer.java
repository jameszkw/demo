package com.zkw.concurrent.countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class Decrementer implements Runnable {
    CountDownLatch latch;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            latch.countDown();
            System.out.println("1");
            Thread.sleep(1000);
            latch.countDown();
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("3");
            latch.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
