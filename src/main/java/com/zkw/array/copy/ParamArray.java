package com.zkw.array.copy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public class ParamArray {
    private static void setParam(String... strs){
        System.out.println(strs);
        for (int i=0;i<strs.length;i++){
            strs[i]=strs[i]+"1";
        }
    }

    private static void setMap(Map map){
        map.put("1",2);
    }

    private static void setInt(int i){
        i=2;
    }

    public static void main(String[] args) {
        String[] strs={"1","2"};
        setParam(strs);
        setParam("3");

        for (String str:strs){
            System.out.println(str);
        }

        Map map=new HashMap();
        map.put("1",1);
        setMap(map);
        System.out.println(map.get("1"));

        int i=1;
        setInt(i);
        System.out.println(i);
    }
}
