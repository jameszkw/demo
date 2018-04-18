package com.zkw.designpatterns.justtest;

import java.util.Collection;
import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-30 下午 3:21
 **/

public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行");
        return map.values();
    }
}
