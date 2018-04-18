package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_4.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:54
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0;i<100000;i++){
            System.out.println("i="+(i+1));
        }
        System.out.println("run begin");
        try {
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
