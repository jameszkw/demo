package com.zkw.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 上午 10:44
 **/

public class AtomicIntegerArrayTest {
    private final static AtomicIntegerArray ATOMIC_INTEGER_ARRAY = new AtomicIntegerArray(10);

    public static void main(String[] args) throws InterruptedException {
        Thread []threads = new Thread[100];
        for (int i=0;i<100;i++){
            final int index = i%10;
            final int threadNum = i;
            threads[i] = new Thread(){
                @Override
                public void run() {
                    int result = ATOMIC_INTEGER_ARRAY.addAndGet(index,index+1);
                    System.out.println("线程编号为："+threadNum+",对应的原始值为："+(index+1)+",增加后的结果："+result);
                }
            };
            threads[i].start();
        }
        for (Thread t:threads){
            t.join();
        }
        System.out.println("=============>\n执行已经完成，结果列表：");
        for (int i=0;i<ATOMIC_INTEGER_ARRAY.length();i++){
            System.out.println(ATOMIC_INTEGER_ARRAY.get(i));
        }
    }
}
