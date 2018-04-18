package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:50
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("run begin");
        try {
            Thread.sleep(200000);
            System.out.println("run end");

        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
