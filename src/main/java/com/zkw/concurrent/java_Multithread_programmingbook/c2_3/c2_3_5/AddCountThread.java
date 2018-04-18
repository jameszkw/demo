package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 7:28
 **/

public class AddCountThread extends Thread {
    private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
