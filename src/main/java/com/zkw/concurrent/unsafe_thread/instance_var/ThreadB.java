package com.zkw.concurrent.unsafe_thread.instance_var;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-27 下午 6:22
 **/

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.addI("b");
    }
}
