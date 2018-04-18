package com.zkw.collection.map;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/5 0005.
 */
public class ValuesMethod {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("a", "zhang");
        hashMap.put("b", "zhang");
        hashMap.put("c", "zhng");
        System.out.println();
        Collection collection=hashMap.values();
        System.out.println();
        String[] str1s = (String[])collection.toArray(new String[collection.size()]);
//        String[] strs = (String[]) collection.toArray();  会报错


    }
}
