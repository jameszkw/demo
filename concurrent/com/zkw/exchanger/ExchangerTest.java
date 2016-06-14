package com.zkw.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class ExchangerTest {
    public static void main(String[] args) {
        Exchanger exchanger=new Exchanger();
        ExchangerRunnable runnable=new ExchangerRunnable(exchanger,"A");
        ExchangerRunnable runnable1=new ExchangerRunnable(exchanger,"B");

        new Thread(runnable).start();
        new Thread(runnable1).start();
    }
}
