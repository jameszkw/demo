package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_10.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 2:22
 **/

public class Service {
    public static void print(Object object){
        synchronized (object){
            while (true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
