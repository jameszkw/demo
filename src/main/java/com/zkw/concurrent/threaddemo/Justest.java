package com.zkw.concurrent.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-11-08 上午 11:29
 **/

public class Justest {
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(2);
        service.execute(new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId()+"run");
            }
        });
    }
}
