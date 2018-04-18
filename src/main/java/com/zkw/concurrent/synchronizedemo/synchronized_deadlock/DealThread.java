package com.zkw.concurrent.synchronizedemo.synchronized_deadlock;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-02 上午 10:53
 **/

public class DealThread implements Runnable {
    public String username;
    public Object lock1=new Object();
    public Object lock2=new Object();
    public void setFlag(String username){
        this.username=username;
    }

    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.printf("username="+username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行了");
                }
            }
        }
        if (username.equals("b")){
            synchronized (lock2){
                try {
                    System.out.printf("username="+username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2->lock1代码顺序执行了");
                }
            }
        }

    }
}
