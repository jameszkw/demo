package com.zkw.concurrent.atomic;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 解决ABA问题
 *
 * @author James
 * @create 2017-09-06 下午 2:58
 **/

public class AtomicStampedReferenceTest {
    public final static AtomicStampedReference<String> ATOMIC_STAMPED_REFERENCE = new AtomicStampedReference<String>("abc",0);
    private final static Random RANDOM_OBJECT= new Random();

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch startCountDownLatch = new CountDownLatch(1);
        Thread[] threads = new Thread[20];
        for (int i=0;i<20;i++){
            final int num = i;
            threads[i]=new Thread(){
                @Override
                public void run() {
                    String oldValue = ATOMIC_STAMPED_REFERENCE.getReference();
                    int stamp = ATOMIC_STAMPED_REFERENCE.getStamp();
                    try {
                        startCountDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(RANDOM_OBJECT.nextInt()&500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (ATOMIC_STAMPED_REFERENCE.compareAndSet(oldValue,oldValue+num,stamp,stamp+1)){
                        System.out.println("线程："+num+",进行对象修改！");
                    }
                }
            };
            threads[i].start();
        }
        Thread.sleep(200);
        startCountDownLatch.countDown();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(RANDOM_OBJECT.nextInt()&200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int stamp = ATOMIC_STAMPED_REFERENCE.getStamp();
                while (!ATOMIC_STAMPED_REFERENCE.compareAndSet(ATOMIC_STAMPED_REFERENCE.getReference(),"abc",stamp,stamp+1)){
                    stamp = ATOMIC_STAMPED_REFERENCE.getStamp();
                }
                System.out.println("已经改为原始值!");
            }
        }.start();
    }
}
