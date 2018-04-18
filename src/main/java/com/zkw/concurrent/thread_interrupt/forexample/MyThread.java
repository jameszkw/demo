package com.zkw.concurrent.thread_interrupt.forexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 6:02
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<500000;i++){
            if (this.interrupted()){
                System.out.println("已结是停止状态了！我要退出");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并为停止！");
    }
}
