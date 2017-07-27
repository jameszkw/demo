package com.zkw.algorithm.datastructure.javacollection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-19 下午 4:17
 **/

public class MapJustest {
    static HashMap map = new HashMap();
    public static void main(String[] args) {
        map.put("1",1);
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);

        Integer i3 = 1000;
        Integer i4 = 1000;
        System.out.println(i3 == i4);
    }
}
