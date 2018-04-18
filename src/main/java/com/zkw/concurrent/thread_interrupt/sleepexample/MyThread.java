package com.zkw.concurrent.thread_interrupt.sleepexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 10:33
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
//            System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
