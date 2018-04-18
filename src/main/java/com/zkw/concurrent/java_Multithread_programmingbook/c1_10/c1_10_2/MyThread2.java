package com.zkw.concurrent.java_Multithread_programmingbook.c1_10.c1_10_2;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 8:39
 **/

public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        long addResult=0;
        for (int j=0;j<10;j++){
            for (int i=0;i<50000;i++){
                Random random=new Random();
                random.nextInt();
                addResult=addResult+1;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("==========thread 2 user time"+(endTime-beginTime));
    }
}
