package com.zkw.concurrent.synchronizedemo.synchronized_deadlock.resolve_semaphore;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 4:38
 **/

public class LockBa implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + "陈顶天开始拿餐具吃饭");
            while (true) {
                if (UnDeadLock.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + "陈顶天抢到了筷子");
                    if (UnDeadLock.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + "陈顶天抢到了碗,凑齐了餐具,准备吃饭");
                        Thread.sleep(60 * 1000 * 10); // 抢到餐具就开始吃饭,吃饭时间十分钟
                    } else {
                        System.out.println(new Date().toString() + "碗已经被抢走了,陈顶天抢碗失败");
                    }
                } else {
                    System.out.println(new Date().toString() + "筷子已经被抢走了,陈顶天抢筷子失败");
                }
                UnDeadLock.a1.release(); // 释放
                UnDeadLock.a2.release();
                System.out.println(new Date().toString() + "陈顶天把抢到的部分餐具又放回原处");
                Thread.sleep(10 * 1000);//这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
