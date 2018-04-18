package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_11;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 2:34
 **/

public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinueRun=true;
        while (isContinueRun){

        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.printf("methodB begin");
        System.out.printf("methodB end");
    }
}
