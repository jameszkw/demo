package com.zkw.concurrent.threadpool.schedual;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorService测试类
 * */
public class SchedualDemo {
    private static ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
    /**
     * 延迟2s，每2s执行一次任务，总共执行10s
     * */
    private  static void beepForAnHour(){
        //创建任务
        Runnable beeper = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("beep");
            }
        };
        //初始化任务延迟时间和间隔执行时间
        long start = System.currentTimeMillis();
//        System.out.println("开始。。。"+start);
        final ScheduledFuture beeperHandle = scheduled.scheduleAtFixedRate(beeper,2,2, TimeUnit.SECONDS);
//        System.out.println("结束。。。"+String.valueOf(System.currentTimeMillis()-start));
        //控制此线程池只执行1分钟
        scheduled.schedule(new Runnable() {
            public void run() {
                beeperHandle.cancel(true);
            }
        },10,TimeUnit.SECONDS);
    }
    public static void main(String[] args) {
        beepForAnHour();
    }
}
