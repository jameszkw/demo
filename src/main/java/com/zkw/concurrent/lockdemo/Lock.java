package com.zkw.concurrent.lockdemo;

/**
 * Created by Administrator on 2016/6/13 0013.
 * 自己实现LOCK
 */
public class Lock {
    private boolean isLoacked=false;

    public synchronized void lock() throws InterruptedException{
        while (isLoacked){
            wait();
        }
        isLoacked=true;
    }

    public synchronized void unlock(){
        isLoacked=false;
        notify();
    }
}
