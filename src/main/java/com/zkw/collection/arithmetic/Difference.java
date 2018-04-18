package com.zkw.collection.arithmetic;

import org.eclipse.jetty.util.ConcurrentHashSet;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class Difference {
    private void difference(){
        ConcurrentHashMap<String,Integer> totalCountMap = new ConcurrentHashMap<String,Integer>();
        totalCountMap.put("1",2);
        totalCountMap.put("3",2);
        totalCountMap.put("2",2);
        Set totalCountKeySets = totalCountMap.keySet();
        totalCountKeySets.remove("1");
        System.out.println(totalCountKeySets);
        System.out.println(totalCountMap);
    }

    private static void add(){
        ConcurrentHashSet<Map> totalCountMap = new ConcurrentHashSet<Map>();
        System.out.println(totalCountMap);
    }
    public static void main(String[] args) {
        add();
    }
}
