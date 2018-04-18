package com.zkw.array.substractest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public class SubstractTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.subList(0,list.indexOf(3)));
    }
}
