package com.zkw.classtest;

import com.zkw.relationship.ObjectDemo;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class TypeClassDemo {
    public static void main(String[] args) {
        String str = "str";
        Object obj = new Object();
        System.out.println(str.getClass());
        System.out.println(obj.getClass());
        Method[] methods = str.getClass().getMethods();
        for (Method method : methods){
            System.out.println(method.getModifiers());
        }
    }
}
