package com.zkw.concurrent.java_Multithread_programmingbook.c1_7.c1_7_3.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 7:41
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i=0;i<500000;i++){
                if (this.isInterrupted()){
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("wo在for外面");
        }catch (InterruptedException e){
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }

    }
}
