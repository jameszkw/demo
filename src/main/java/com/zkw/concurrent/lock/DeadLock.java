package com.zkw.concurrent.lock;

/**
 * Created by Administrator on 2016/4/26 0026.
 */
public class DeadLock extends Thread {
    protected Object tool;
    static Object fork1 = new Object();
    static Object fork2 = new Object();

    public DeadLock(Object tool) {
        this.tool = tool;
        if (tool==fork1){
            this.setName("A");
        }
        if (tool==fork2){
            this.setName("B");
        }
    }

    @Override
    public void run() {
        if (tool==fork1){
            synchronized (fork1){

            }
        }
    }
}
