package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_16;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 4:42
 **/

public class MyService {
    private String lock="123";
    public void testMethod(){
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
            lock="456";
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
        }
    }


}
