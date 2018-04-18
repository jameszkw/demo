package com.zkw.concurrent.java_Multithread_programmingbook.c2_2.c2_2_7.dirtyread;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-07 下午 9:24
 **/

public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
