package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_8.second;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 10:01
 **/

public class ThreadB extends Thread {
    private Main main;

    public ThreadB(Main main) {
        this.main = main;
    }

    @Override
    public void run() {
        super.run();
        main.serviceMethod();
    }
}
