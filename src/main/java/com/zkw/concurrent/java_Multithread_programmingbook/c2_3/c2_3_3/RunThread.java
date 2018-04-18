package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_3;

/**
 * JVM中加-server参数会死循环
 *
 * @author James
 * @create 2017-09-09 下午 6:39
 **/

public class RunThread extends Thread {
    private boolean isRunning=true;
    public boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning==true){

        }
        System.out.println("线程被停止了！");
    }
}
