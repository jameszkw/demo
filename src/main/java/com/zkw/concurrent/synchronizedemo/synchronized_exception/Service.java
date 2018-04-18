package com.zkw.concurrent.synchronizedemo.synchronized_exception;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 2:00
 **/

public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" run beginTime="+System.currentTimeMillis());
            int i=1;
            while (i==1){
                System.out.println("ThreadName="+Thread.currentThread().getName()+" run exceptionTime="+System.currentTimeMillis());
                Integer.parseInt("a");
            }
        } else {
            System.out.println("Thread B run Time="+System.currentTimeMillis());
        }
    }
}
