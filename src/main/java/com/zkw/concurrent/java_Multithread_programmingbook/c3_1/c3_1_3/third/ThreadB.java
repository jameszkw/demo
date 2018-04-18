package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.third;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:57
 **/

public class ThreadB extends Thread{
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            for (int i=0;i<10;i++){
                MyList.add();
                if (MyList.size()==5){
                    lock.notify();
                    System.out.println("已发出通知！");
                }
                System.out.println("添加了"+(i+1)+"个元素！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
