package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:17
 **/

public class ObjectService {
    public void serviceMethod(){
        synchronized (this){
            System.out.println("begin time="+System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end time="+System.currentTimeMillis());
        }
    }
}
