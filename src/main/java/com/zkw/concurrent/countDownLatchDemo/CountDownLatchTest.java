package com.zkw.concurrent.countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);
        Waiter1 waiter1=new Waiter1(countDownLatch);
        Waiter waiter=new Waiter(countDownLatch);
        Decrementer decrementer=new Decrementer(countDownLatch);

        new Thread(waiter).start();
        new Thread(waiter1).start();
        new Thread(decrementer).start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
