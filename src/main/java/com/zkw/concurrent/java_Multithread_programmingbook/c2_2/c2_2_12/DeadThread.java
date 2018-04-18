package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_12;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-09 下午 3:31
 **/

public class DeadThread implements Runnable {
    public String username;
    public Object lock1=new Object();
    public Object lock2=new Object();

    public void setFalg(String username){
        this.username=username;
    }
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                System.out.println("username="+username);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lock2){
                System.out.println("按Lock->lock2代码顺序执行了");
            }
        }
        if(username.equals("b")){
            synchronized (lock2){
                System.out.println("username="+username);
                try {
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
