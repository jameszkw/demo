package com.zkw.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/5 0005.
 */
public class SesitiveKey {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("AA","1");
        map.put("aa","2");

        System.out.println(map.get("AA"));
        System.out.println(map.get("aa"));
    }
}
