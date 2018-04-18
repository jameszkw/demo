package com.zkw.concurrent.java_Multithread_programmingbook.c3_1.c3_1_3.third;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-09-10 下午 9:54
 **/

public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("anyString");

    }
    public static int size(){
        return list.size();
    }
}
