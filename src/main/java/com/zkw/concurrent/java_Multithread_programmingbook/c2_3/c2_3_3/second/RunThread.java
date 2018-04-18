package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_3.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 6:57
 **/

public class RunThread extends Thread {
    volatile private boolean isRunning=true;

    public boolean isRunning() {
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
