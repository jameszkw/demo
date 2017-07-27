package com.zkw.collection.list;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-07-12 下午 2:50
 **/

public class ArrayListest {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(2);
        List linkedList = new LinkedList();
        Set set = new HashSet();
        Stack stack = new Stack();
        Vector vector = new Vector();
        linkedList.add(4);
        stack.add(3);
        vector.add(2);
        set.add(1);
        List arrayList = new ArrayList(linkedList);
        System.out.println(arrayList.get(0));
    }
}
