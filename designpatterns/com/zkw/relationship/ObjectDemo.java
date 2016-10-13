package com.zkw.relationship;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class ObjectDemo {
    static Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap(16);
    static Object NULL_OBJECT = new Object();

    private static Object nullObject(){
//        factoryBeanObjectCache.put("beanName",NULL_OBJECT);
        Object object = factoryBeanObjectCache.get("beanName");
//        String object = new String();
//        System.out.println(object != NULL_OBJECT);
        System.out.println(object != NULL_OBJECT);
        return object != NULL_OBJECT?object:null;
    }

    public static void main(String[] args) {
        System.out.println(nullObject());
    }
}
