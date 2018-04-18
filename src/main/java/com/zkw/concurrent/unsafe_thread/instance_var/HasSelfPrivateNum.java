package com.zkw.concurrent.unsafe_thread.instance_var;

/**
 * 线程共用对象
 *
 * @author James
 * @create 2018-02-27 下午 6:16
 **/

public class HasSelfPrivateNum {
    private int num=0;
    public /*synchronized*/ void addI(String name){
        if (name.equals("a")){
            num=100;
            System.out.println("a set over");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num=200;
            System.out.println("b set over");
        }
        System.out.println(name+" num="+num);
    }
}
