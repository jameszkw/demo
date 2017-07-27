package com.zkw.collection;

import java.util.*;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class Test {
    static List list=new ArrayList();
    static List li2 = new LinkedList();
    static List ve = new Vector();
    static List st = new Stack();

    static List synList = Collections.synchronizedList(new ArrayList());

    static Set hashSet = new HashSet();
    static Set treeSet = new TreeSet();
    static Set linkedHashSet = new LinkedHashSet();

    static Map hashMap = new HashMap();
    static Map treeMap = new TreeMap();
    static Map hashtable = new Hashtable();
    static Map weakHashMap = new WeakHashMap();
    static Map identityHashMap = new IdentityHashMap();

    private static void iteratorTest(){
        li2.iterator();
        list.iterator();
    }

    public static void main(String[] args) {
        Object[] ob = new Object[0];
        Object[] ob1 = {};
        Object[] ob2 = new Object[]{1,2};
//        ob[0]=3;
//        ob1[0]=2;
        ob2[0]=2;
    }
}
