package com.zkw.concurrent.synchronizedemo.synchronized_deadlock.resolve_semaphore;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 4:27
 **/

public class LockAa implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + "邹保健开始拿餐具吃饭");
            while (true) {
                if (UnDeadLock.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + "邹保健抢到了碗");
                    if (UnDeadLock.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + "邹保健抢到了筷子,凑齐了餐具,准备吃饭");
                        Thread.sleep(/*60 **/ 1000 * 10); // 抢到餐具就开始吃饭,吃饭时间十分钟
                    } else {
                        System.out.println(new Date().toString() + "筷子已经被抢走了,邹保健抢筷子失败");
                    }
                } else {
                    System.out.println(new Date().toString() + "碗已经被抢走了,邹保健抢碗失败");
                }
                UnDeadLock.a1.release(); // 释放
                UnDeadLock.a2.release();
                System.out.println(new Date().toString() + "邹保健把抢到的部分餐具又放回原处");
                Thread.sleep(1000); // 马上进行尝试，现实情况下do something是不确定的
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
