package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7;

/**
 * 使用synchronized（非this对象x）同步代码块时，对象监视器必须是同一个对象。如果不是同一个对象监视器，运行的结果就是异步调用了。
 * 如果将“String anyString=new String();”放到方法外变成实例变量就是同步执行方法。
 *
 * @author James
 * @create 2017-09-07 下午 8:53
 **/

public class Service {
    private String usernameParam;
    private String passwordParam;
    public void setUsernamePassword(String username,String password){
        String anyString=new String();

        synchronized (anyString){
            System.out.println("线程名称："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步块");
            usernameParam=username;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordParam=password;
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步块");
        }
    }
}
