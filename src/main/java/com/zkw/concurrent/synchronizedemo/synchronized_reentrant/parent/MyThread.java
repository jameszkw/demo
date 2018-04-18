package com.zkw.concurrent.synchronizedemo.synchronized_reentrant.parent;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:18
 **/

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operateISubMethod();
        sub.operateIMainMethod();
    }
}
