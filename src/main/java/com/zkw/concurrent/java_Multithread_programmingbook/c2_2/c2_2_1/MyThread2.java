package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_1;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 7:58
 **/

public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2=System.currentTimeMillis();
    }
}
