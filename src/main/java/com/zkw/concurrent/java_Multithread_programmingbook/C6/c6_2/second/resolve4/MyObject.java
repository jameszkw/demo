package com.zkw.concurrent.java_Multithread_programmingbook.C6.c6_2.second.resolve4;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-18 下午 9:43
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    //使用双检查机制解决问题，既能保证不需要同步代码的异步执行性
    //又保证了单例的效果
    public static MyObject getInstance(){
        try {
            if (myObject!=null){

            }else {
                //模拟准备工作
                Thread.sleep(300);
                synchronized (MyObject.class){
                    if (myObject==null){
                        myObject=new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
