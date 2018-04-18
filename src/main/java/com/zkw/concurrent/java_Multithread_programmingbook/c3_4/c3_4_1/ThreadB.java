package com.zkw.concurrent.java_Multithread_programmingbook.c3_4.c3_4_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-13 下午 9:14
 **/

public class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("在ThreadB线程中取值="+Tools.t1.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
