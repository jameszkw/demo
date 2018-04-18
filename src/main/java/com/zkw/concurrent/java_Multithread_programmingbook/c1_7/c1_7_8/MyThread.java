package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_8;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 8:05
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("time="+System.currentTimeMillis());
        }
    }
}
