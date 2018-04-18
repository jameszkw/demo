package com.zkw.concurrent.atomic;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 上午 11:30
 **/

public class AtomicReferenceTest {
    public final static AtomicReference<String> ATOMIC_REFERENCE = new AtomicReference<String>("abc");
    private final static Random RANDOM_OBJECT = new Random();

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch startCountDownLatch = new CountDownLatch(1);
        Thread[] threads = new Thread[20];
        for (int i=0;i<20;i++){
            final int num=i;
            threads[i] = new Thread(){
                @Override
                public void run() {
                    String oldValue = ATOMIC_REFERENCE.get();
                    try {
                        startCountDownLatch.await();
                        Thread.sleep(RANDOM_OBJECT.nextInt()&1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (ATOMIC_REFERENCE.compareAndSet(oldValue,oldValue+num)){
                        System.out.println("线程："+num+",进行了对象修改！"+ATOMIC_REFERENCE.get());
                    }
                }
            };
            threads[i].start();
        }
        Thread.sleep(200);
        startCountDownLatch.countDown();
        for (Thread t:threads){
            t.join();
        }
        System.out.println("最终结果为："+ATOMIC_REFERENCE.get());
    }

}
