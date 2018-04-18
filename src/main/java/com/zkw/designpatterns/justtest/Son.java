package com.zkw.designpatterns.justtest;

import java.util.Collection;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-30 下午 3:23
 **/

public class Son extends Father {

    public Collection doSomething(Map map) {
        return map.values();
    }
}
