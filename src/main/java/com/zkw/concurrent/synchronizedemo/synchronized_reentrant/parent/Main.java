package com.zkw.concurrent.synchronizedemo.synchronized_reentrant.parent;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:15
 **/

public class Main {
    public int i=10;
    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
