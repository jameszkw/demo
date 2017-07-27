package com.zkw.enumtest;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/2 0002.
 * EnumSet的使用 EnumMap的使用
 */
public class SetMap {
    public static void main(String[] args) {
        // EnumSet的使用
        EnumSet<EnumTest> weekSet = EnumSet.allOf(EnumTest.class);
        for (EnumTest e:weekSet){
            System.out.println(e);
        }

        // EnumMap的使用
        EnumMap<EnumTest,String> weekMap = new EnumMap<EnumTest, String>(EnumTest.class);
        weekMap.put(EnumTest.MON,"星期一");
        weekMap.put(EnumTest.TUE,"星期二");
        for (Iterator<Map.Entry<EnumTest,String>> iter = weekMap.entrySet().iterator();iter.hasNext();){
            Map.Entry<EnumTest,String> entry = iter.next();
            System.out.println(entry.getKey().name()+": "+entry.getValue());
        }
    }
}
