package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 7:57
 **/

public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1=System.currentTimeMillis();
    }
}
