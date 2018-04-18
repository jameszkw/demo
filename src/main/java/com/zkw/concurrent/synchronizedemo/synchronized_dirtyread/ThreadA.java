package com.zkw.concurrent.synchronizedemo.synchronized_dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 10:40
 **/

public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("B","BB");
    }
}
