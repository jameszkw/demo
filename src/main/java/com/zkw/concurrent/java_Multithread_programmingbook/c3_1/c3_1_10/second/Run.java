package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_10.second;


/**
 * wait等待条件的变化，也容易造成查询逻辑的混乱
 *
 * @author James
 * @create 2017-09-12 下午 8:03
 **/

public class Run {
    public static void main(String[] args) {
        String lock=new String("");
        Add add=new Add(lock);
        SubtractResolve subtract=new SubtractResolve(lock);
        Thread sub=new Thread(subtract);
        sub.setName("subtractThread");
        sub.start();
        Thread sub2=new Thread(subtract);
        sub2.setName("subtract2Thread");
        sub2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread addt=new Thread(add);
        addt.setName("addThread");
        addt.start();
    }
}
