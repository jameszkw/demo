package com.zkw.concurrent.thread_interrupt.forexample;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 下午 10:18
 **/

public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0;i<500000;i++){
                if (this.interrupted()){
                    System.out.println("已结是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i="+i);
            }
        }catch (InterruptedException e){
            System.out.println("进MyThread.java类run方法中的catch了");
            e.printStackTrace();
        }

    }

}
