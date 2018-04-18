package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:28
 **/

public class ObjectService {
    public void serviceMethodA(){
        synchronized (this){
            System.out.println("A begin time="+System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A end time="+System.currentTimeMillis());
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B end time="+System.currentTimeMillis());
        }
    }
}
