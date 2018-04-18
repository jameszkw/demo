package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 9:10
 **/

public class Service {
    private String anyString = new String();
    public void a(){
        synchronized (anyString){
            System.out.println("a begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end");
        }
    }

    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
