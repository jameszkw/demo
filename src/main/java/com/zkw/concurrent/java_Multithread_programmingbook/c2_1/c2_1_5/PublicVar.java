package com.zkw.concurrent.java_Multithread_programmingbook.c2_1.c2_1_5;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-06 下午 8:30
 **/

public class PublicVar {
    public String username="A";
    public String password="AA";

    synchronized public void setValue(String username,String password){
        this.username=username;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password=password;
        System.out.println("setValue method thread name="+Thread.currentThread().getName()+"username="+username+" password="+password);
    }

    public void getValue(){
        System.out.println("getValue method thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
    }
}
