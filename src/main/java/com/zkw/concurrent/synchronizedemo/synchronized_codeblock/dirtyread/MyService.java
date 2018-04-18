package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.dirtyread;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:56
 **/

public class MyService {
    public MyOneList addServicMethod(MyOneList list,String data){
        try {
            synchronized (list){
                if (list.getSize()<1){
                    Thread.sleep(2000);//模拟从远程花费2秒取回数据
                    list.add(data);
                }

            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
