package com.zkw.concurrent.exeservdemo;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public class ExeServDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor exe= new ThreadPoolExecutor(3,3,0L, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        exe.execute(new Thread(){
            @Override
            public void run() {
                System.out.println("thread ... ...");
            }
        });
        System.out.println(exe.getQueue().size());
        Boolean.valueOf(true);
    }
}
