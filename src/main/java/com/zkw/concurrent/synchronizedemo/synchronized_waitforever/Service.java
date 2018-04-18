package com.zkw.concurrent.synchronizedemo.synchronized_waitforever;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 9:38
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
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
