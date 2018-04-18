package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:19
 **/

public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
