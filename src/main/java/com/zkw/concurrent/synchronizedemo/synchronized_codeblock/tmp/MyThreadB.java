package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.tmp;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:15
 **/

public class MyThreadB extends Thread {
    private MyList list;

    public MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=0;i<100000;i++){
            list.add("threadB"+i);
        }
    }
}
