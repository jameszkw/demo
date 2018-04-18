package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.classblock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 4:26
 **/

public class Service {
    public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("thread name:"+Thread.currentThread().getName()+" at "+System.currentTimeMillis()+" in printA");
                Thread.sleep(3000);
                System.out.println("thread name:"+Thread.currentThread().getName()+" at "+System.currentTimeMillis()+" out printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB(){
        synchronized (Service.class){
            try {
                System.out.println("thread name:"+Thread.currentThread().getName()+" at "+System.currentTimeMillis()+" in printB");
                Thread.sleep(3000);
                System.out.println("thread name:"+Thread.currentThread().getName()+" at "+System.currentTimeMillis()+" out printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
