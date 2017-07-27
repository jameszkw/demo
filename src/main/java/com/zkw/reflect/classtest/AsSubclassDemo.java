package com.zkw.reflect.classtest;

import java.util.ArrayList;
import java.util.List;

/**
 * <U> Class<? extends U> asSubclass(Class<U> clazz) 例子
 * 说明：判断Class是否是clazz的子类
 *
 * @author James
 * @create 2017-07-27 上午 9:42
 **/

public class AsSubclassDemo {

    private static void asNotSubclass(){
        try {
            Class.forName("com.zkw.reflect.classtest.Man").asSubclass(FooParents.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        asNotSubclass();
    }
}
