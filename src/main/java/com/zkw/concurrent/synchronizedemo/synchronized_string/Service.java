package com.zkw.concurrent.synchronizedemo.synchronized_string;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 8:45
 **/

public class Service {
    public static void  print(String stringParam){
        try {
            synchronized (stringParam){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
