package com.zkw.concurrent.synchronizedemo.synchronized_codeblock.tmp;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-03-01 下午 3:11
 **/

public class MyList {
    private List list=new ArrayList();
    synchronized public void add(String username){
        System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了add方法");
        list.add(username);
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了add方法");
    }

    synchronized public int getSize(){
        System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了getSize方法");
        int sizevalue=list.size();
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了getSize方法");
        return sizevalue;
    }
}
