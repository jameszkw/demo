package com.zkw.concurrent.synchronizedemo.synchronized_reentrant;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-28 上午 11:09
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        Service service=new Service();
        service.service1();
    }
}
