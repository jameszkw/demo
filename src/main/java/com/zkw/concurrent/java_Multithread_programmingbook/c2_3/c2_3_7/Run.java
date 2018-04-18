package com.zkw.concurrent.java_Multithread_programmingbook.c2_3.c2_3_7;

/**
 * JVM加-server运行会停止不了。原因是线程间的数据值没有可视性造成的。而关键字synchronized可以具有可视性。
 *
 * @author James
 * @create 2017-09-09 下午 7:59
 **/

public class Run {

    private static void startSafe(){
        ServiceSafe service=new ServiceSafe();
        ThreadASafe a=new ThreadASafe(service);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadBSafe b=new ThreadBSafe(service);
        b.start();
        System.out.println("已经发起停止的命令了！");
    }

    private void start(){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB b=new ThreadB(service);
        b.start();
        System.out.println("已经发起停止的命令了！");
    }
    public static void main(String[] args) {
        startSafe();
    }
}
