package com.zkw.classloader.exceptiondemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class CastExcetion {
    public static Map m=new HashMap(){
        {
            put("a","2");
        }
    };
    public static void main(String[] args) {
        Integer integer =(Integer)m.get("a");
        System.out.println(integer);
    }
}
