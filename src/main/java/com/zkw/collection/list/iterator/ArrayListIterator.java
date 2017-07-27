package com.zkw.collection.list.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-13 下午 4:48
 **/

public class ArrayListIterator {
    static List arrayList = new ArrayList();
    public static void main(String[] args) {
        arrayList.add("1");
        arrayList.add(45);
        arrayList.iterator();
        System.out.println(arrayList.get(0));
    }
}
