package com.zkw.collection.concurrnthashmspdemo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/12/13 0013.
 */
public class Test {
    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        hashMap.put("al",1);
        hashMap.put("al",31);
        System.out.println(hashMap.get("al"));
    }
}
