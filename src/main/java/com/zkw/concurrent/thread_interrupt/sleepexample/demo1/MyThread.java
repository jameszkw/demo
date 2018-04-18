package com.zkw.concurrent.thread_interrupt.sleepexample.demo1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 10:47
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i<100000;i++){
                System.out.println("i="+i);
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("先停止，再遇到了sleep！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
