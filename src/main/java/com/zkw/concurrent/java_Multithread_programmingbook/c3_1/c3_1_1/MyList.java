package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_1;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:18
 **/

public class MyList {
    private List list=new ArrayList();
    public void add(){
        list.add("周杰伦");
    }
    public int size(){
        return list.size();
    }
}
