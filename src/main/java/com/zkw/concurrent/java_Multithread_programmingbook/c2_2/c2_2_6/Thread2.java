package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_6;



/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 8:19
 **/

public class Thread2 extends Thread {
    private Task task;

    public Thread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
