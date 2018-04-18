package com.zkw.concurrent.unsafe_thread.instance_var;

/**
 * 入口
 *
 * @author James
 * @create 2018-02-27 下午 6:23
 **/

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(numRef);
        ThreadB threadB=new ThreadB(numRef1);
        threadA.start();
        threadB.start();
    }
}
