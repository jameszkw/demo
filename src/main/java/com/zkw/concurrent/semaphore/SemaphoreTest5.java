package com.zkw.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-09 下午 3:04
 **/

public class SemaphoreTest5 {
    private static void acquire(){
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            System.out.println("第一次获取许可");
            semaphore.acquire();
            System.out.println("第二次获取许可");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void realease(){
        Semaphore semaphore = new Semaphore(1);
        semaphore.release();
        System.out.println("第一次释放许可,可用的许可："+semaphore.availablePermits());
        semaphore.release();
        System.out.println("第二次释放许可,可用的许可："+semaphore.availablePermits());
    }

    public static void main(String[] args) {
//        acquire();
        realease();
    }
}
