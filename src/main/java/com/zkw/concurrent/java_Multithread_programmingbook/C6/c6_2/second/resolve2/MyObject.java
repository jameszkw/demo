package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2.second.resolve2;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 9:32
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance(){
        //此种方法等同于：
        //synchronized public static MyObject getInstance()
        //的写法，效率一样很低，全部代码被上锁
        try {
            synchronized (MyObject.class){
                if (myObject!=null){

                }else {
                    //准备工作
                    Thread.sleep(300);
                    myObject=new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
