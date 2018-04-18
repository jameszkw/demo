package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 9:26
 **/

public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list){
                if (list.getSize() < 1) {
                    Thread.sleep(2000);//模拟从远程花费2秒取回数据
                    list.add(data);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return list;
    }
}
