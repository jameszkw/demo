package com.zkw.concurrent.yield;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 上午 11:20
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count=0;
        for (int i=0;i<50000000;i++){
            Thread.yield();
            count=count+1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒！");
    }
}
