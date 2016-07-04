package com.zkw.javasisstdemo;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class Generator1 {

    private void simpleDemo(){
        ClassPool pool=ClassPool.getDefault();
        try {
            CtClass cc=pool.get("test.Rectangle");
            cc.getSuperclass();

        } catch (NotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ClassPool pool=ClassPool.getDefault();
    }
}
