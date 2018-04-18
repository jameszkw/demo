package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_7;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 9:45
 **/

public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" run beginTime="+System.currentTimeMillis());
            int i=1;
            while (i==1){
                if (true){
                    System.out.println("ThreadName="+Thread.currentThread().getName()+" run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time="+System.currentTimeMillis());
        }
    }
}
