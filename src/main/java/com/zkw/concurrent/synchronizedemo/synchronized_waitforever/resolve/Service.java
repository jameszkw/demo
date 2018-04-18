package com.zkw.concurrent.synchronizedemo.synchronized_waitforever.resolve;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 10:00
 **/

public class Service {
    Object object1=new Object();
    Object object2=new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun=true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }

    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
