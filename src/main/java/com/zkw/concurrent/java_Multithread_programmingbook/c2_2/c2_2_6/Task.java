package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_6;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:36
 **/

public class Task {
    public void otherMethod(){
        System.out.println("----------------------run--otherMethod");
    }
    public void doLongTimeTask(){
        synchronized (this){
            for (int i=0;i<10;i++){
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
