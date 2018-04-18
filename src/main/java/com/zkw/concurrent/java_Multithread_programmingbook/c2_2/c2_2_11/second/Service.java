package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_11.second;

/**
 * 解决同步方法死循环问题
 *
 * @author James
 * @create 2017-09-09 下午 2:52
 **/

public class Service {
    Object object1=new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun=true;
            while (isContinueRun){
            }
            System.out.println("metnodA end");
        }
    }

    Object object2=new Object();
    public void metnodB(){
        synchronized (object2){
            System.out.println("mentodB begin");
            System.out.println("methodA end");
        }
    }
}
