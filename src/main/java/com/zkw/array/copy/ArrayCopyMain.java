package com.zkw.array.copy;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class ArrayCopyMain {
    public static void main(String[] args) {
        String[] strs=new String[3];
        String[] des=new String[strs.length+1];
        strs[0]="0";
        strs[1]="1";
        strs[2]="2";

        System.arraycopy(strs,2,des,2,strs.length-2);
        for (String de: des){
            System.out.println(de);
        }
    }
}
