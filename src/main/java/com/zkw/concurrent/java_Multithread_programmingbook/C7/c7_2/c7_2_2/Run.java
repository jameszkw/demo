package com.zkw.concurrent.java_Multithread_programmingbook.C7.c7_2.c7_2_2;

/**
 * 多级关联 不常见 没完成
 *
 * @author James
 * @create 2017-09-19 下午 9:28
 **/

public class Run {
    public static void main(String[] args) {
        //在main组中添加一个线程组A,然后在这个A组中添加线程对象Z
        //方法activeGroupCount()和activeCount()的值不是固定的
        //是系统中环境的一个快照
        ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
        ThreadGroup group=new ThreadGroup(mainGroup,"A");
        Runnable runnable=new Runnable() {
            public void run() {
                try {
                    System.out.println("runMethod");
                    Thread.sleep(10000);//线程必须在运行状态才可以受组管理
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread newThread=new Thread(group,runnable);
        newThread.setName("Z");
        newThread.start();//线程必须启动然后才归到组A中
//        ThreadGroup
    }
}
