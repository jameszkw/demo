package com.zkw.concurrent.thread_interrupt.returnexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 上午 9:57
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}
