package com.zkw.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Administrator on 2016/6/13 0013.
 *
 */
public class ExchangerRunnable implements Runnable {
    Exchanger exchanger;
    Object object;

    public ExchangerRunnable(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    public void run() {
        Object previous=this.object;
        try {
            System.out.println(Thread.currentThread().getName()+" before "+this.object);
            this.object=this.exchanger.exchange(this.object);
            System.out.println(Thread.currentThread().getName()+" exchanged "+previous+" for "+this.object);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
