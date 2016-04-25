package com.zkw.basic;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class BadLockOnInteger implements Runnable {

    public static Integer i=0;
    static BadLockOnInteger badLockOnInteger=new BadLockOnInteger();

    public void run() {
        for (int j=0;j<10000;j++){
            synchronized (i){
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(badLockOnInteger);
        Thread t2=new Thread(badLockOnInteger);
        t1.start();t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
