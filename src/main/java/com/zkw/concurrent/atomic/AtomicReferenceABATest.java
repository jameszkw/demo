package com.zkw.concurrent.atomic;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 模拟ABA问题
 *
 * @author James
 * @create 2017-09-06 下午 2:05
 **/

public class AtomicReferenceABATest {
    public final static AtomicReference<String> ATOMIC_REFERENCE = new AtomicReference<String>("abc");
    private final static Random RANDOM_OBJECT = new Random();

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch startCountDownLatch = new CountDownLatch(1);
        Thread[] threads = new Thread[20];
        for (int i=0;i<20;i++){
            final int num =i;
            threads[i] = new Thread(){
                @Override
                public void run() {
                    String oldValue = ATOMIC_REFERENCE.get();
                    try {
                        startCountDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(RANDOM_OBJECT.nextInt()& 500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (ATOMIC_REFERENCE.compareAndSet(oldValue,oldValue+num)){
                        System.out.println("我是线程："+num+",进行对象修改！"+ATOMIC_REFERENCE.get());
                    }

                }
            };
            threads[i].start();
        }
        Thread.sleep(200);
        startCountDownLatch.countDown();
        /*for (Thread t:threads){
            t.join();
        }*/
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(RANDOM_OBJECT.nextInt()&200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (!ATOMIC_REFERENCE.compareAndSet(ATOMIC_REFERENCE.get(),"abc")){
                    System.out.println("已经改为原始值");
                }
            }
        }.start();
    }
}
