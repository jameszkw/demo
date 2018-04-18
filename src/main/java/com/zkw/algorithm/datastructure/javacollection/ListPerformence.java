package com.zkw.algorithm.datastructure.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试ArrayList与LinkedList添加元素的性能
 * 结论：1.ArrayList初始化add比LinkedList时间短。2.头部添加元素时LinkedList时间短,且中间插入时间也短。
 *      3.查询LinkedList比ArrayList时间长了很久,不能忍，但是如果LinkedList使用iterator会很快。
 * @author James
 * @create 2017-07-13 下午 6:27
 **/

public class ListPerformence {
    private static int num = 10000000;
    private static int first = 0;
    private static int middle = 100000;
    private static List arrayList = new ArrayList();
    private static List linkedList = new LinkedList();

    public static void addList(List<Integer> lst,int n){
        for (int i=0;i<n;i++){
            lst.add(i);
        }
    }

    public static void randomAdd(List<Integer> lst,int index){
        if (lst instanceof LinkedList){
            if (index == 0){
                ((LinkedList) lst).addFirst(2);
            } else {
                ((LinkedList) lst).add(index,2);
            }
        } else if (lst instanceof ArrayList){
            lst.add(index,2);
        } else {
            System.out.println("无此类型的List!");
        }
    }
    /**
     * 循环list中所有的数据，使用for
     * */
    public static void forTest(List<Integer> lst){
        for (int i=0;i<num;i++){
            lst.get(i);
        }
    }
    /**
     * 循环list中所有的数据，使用增强的for，iterator
     * */
    public static void iteratorTest(List<Integer> lst){
        Iterator it = lst.iterator();
        while (it.hasNext()){
            it.next();
        }
    }

    /**
     *
     * */
    public static void testArrayAdd(){
        long arrayStart = System.currentTimeMillis();
        addList(arrayList,num);
        System.out.println("ArrayList init add cost time: "+String.valueOf(System.currentTimeMillis()-arrayStart)+"ms");
    }

    private static void testArrayAddFir(){
        long randomArrayStart = System.currentTimeMillis();
        randomAdd(arrayList,first);
        System.out.println("ArrayList head add cost time: "+String.valueOf(System.currentTimeMillis()-randomArrayStart)+"ms");
    }

    private static void testArrayAddMid(){
        long randomArrayStart = System.currentTimeMillis();
        randomAdd(arrayList,middle);
        System.out.println("ArrayList middle add cost time: "+String.valueOf(System.currentTimeMillis()-randomArrayStart)+"ms");
    }

    private static void testArrayGet(){
        long randomArrayStart = System.currentTimeMillis();
        forTest(arrayList);
        System.out.println("ArrayList for cost time: "+String.valueOf(System.currentTimeMillis()-randomArrayStart)+"ms");
        arrayList.clear();
    }

    private static void testArrayIterator(){
        long randomArrayStart = System.currentTimeMillis();
        iteratorTest(arrayList);
        System.out.println("ArrayList iterator cost time: "+String.valueOf(System.currentTimeMillis()-randomArrayStart)+"ms");

    }

    private static void testLinkedAdd(){
        long linkedStart = System.currentTimeMillis();
        addList(linkedList,num);
        System.out.println("LinkedList init add cost time: "+String.valueOf(System.currentTimeMillis()-linkedStart)+"ms");
    }

    private static void testLinkedAddfir(){
        long randomLinkedStart = System.currentTimeMillis();
        randomAdd(linkedList,first);
        System.out.println("linkedList head add cost time: "+String.valueOf(System.currentTimeMillis()-randomLinkedStart)+"ms");
    }

    private static void testLinkedAddMid(){
        long randomLinkedStart = System.currentTimeMillis();
        randomAdd(linkedList,middle);
        System.out.println("linkedList middle add cost time: "+String.valueOf(System.currentTimeMillis()-randomLinkedStart)+"ms");
    }

    private static void testLinkedGet(){
        System.out.println("linkedList get begin");
        long randomLinkedStart = System.currentTimeMillis();
        forTest(linkedList);
        System.out.println("linkedList get cost time: "+String.valueOf(System.currentTimeMillis()-randomLinkedStart)+"ms");
        linkedList.clear();
    }

    private static void testLinkedIterator(){
        long randomArrayStart = System.currentTimeMillis();
        iteratorTest(linkedList);
        System.out.println("linkedList iterator cost time: "+String.valueOf(System.currentTimeMillis()-randomArrayStart)+"ms");

    }

    public static void main(String[] args) {
        testArrayAdd();
        testArrayAddFir();
        testArrayAddMid();
        testArrayIterator();
        testArrayGet();
        testLinkedAdd();
        testLinkedAddfir();
        testLinkedAddMid();
        testLinkedIterator();
        testLinkedGet();
    }
}
