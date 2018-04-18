package com.zkw.concurrent.synchronizedemo.synchronized_lockchange;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 5:51
 **/

public class MyService {
    private String lock="123";
    public void testMethod(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin"+System.currentTimeMillis());
                lock="456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end"+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
