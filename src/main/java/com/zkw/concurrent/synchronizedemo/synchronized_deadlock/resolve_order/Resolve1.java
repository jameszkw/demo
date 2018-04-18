package com.zkw.concurrent.synchronizedemo.synchronized_deadlock.resolve_order;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 下午 3:18
 **/

public class Resolve1 implements Runnable {
    public  String username;
    public Object lock1=new Object();
    public Object lock2=new Object();
    public void setFlag(String username){
        this.username=username;
    }

    public void run() {
        a();
        b();
    }

    public void a(){
        synchronized (lock1){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("a按lock1->lock2代码顺序执行了");
            }
        }
    }

    public void b(){
        synchronized (lock1){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("b按lock1->lock2代码顺序执行了");
            }
        }
    }
}
