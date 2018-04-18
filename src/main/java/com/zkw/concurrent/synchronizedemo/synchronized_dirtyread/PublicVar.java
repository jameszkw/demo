package com.zkw.concurrent.synchronizedemo.synchronized_dirtyread;

/**
 * 公共类
 *
 * @author James
 * @create 2018-02-28 上午 10:35
 **/

public class PublicVar {
    public String name = "A";
    public String password = "AA";

    synchronized public void setValue(String name,String password){
        try {
            this.name=name;
            Thread.sleep(5000);
            this.password=password;
            System.out.println("setValue method thread name="+Thread.currentThread().getName()+"name="+name+"password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getValue(){
        System.out.println("getValue method thread name="+Thread.currentThread().getName()+" username="+name+" password="+password);
    }
}
