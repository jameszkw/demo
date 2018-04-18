package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_3;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:21
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i=0;i<500000;i++){
            if (this.isInterrupted()){
                System.out.println("已结是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }
}
