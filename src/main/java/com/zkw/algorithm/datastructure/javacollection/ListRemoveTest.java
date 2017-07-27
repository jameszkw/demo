package com.zkw.algorithm.datastructure.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 测试remove方法
 *
 * @author James
 * @create 2017-07-14 下午 5:27
 **/

public class ListRemoveTest {
    static ArrayList arrayList = new ArrayList();
    static int num = 10;
    static Stack stack = new Stack();



    private static void init(){
        for (int i=0;i<num;i++){
            arrayList.add(i);
        }
    }

    /**
     * for循环删除ArrayList中的元素
     * */
    private static void removeFor(List<Integer> lst){
        int i = 0;
        while (i < lst.size()){
            if (i == 0){
                lst.remove(i);
            }
            i++;
        }
        System.out.println("removeFor: "+lst);
    }
    /**
     * interator循环删除ArrayList中的元素，使用ArrayList.remove。
     * 说明：会报错ConcurrentModificationException
     * */
    private static void removeForHigh(List<Integer> lst){
        for (Integer x:lst){
            if (x == 0)
                lst.remove(x);
        }
        System.out.println("removeIterator: "+lst);
    }

    /**
     * interator循环删除ArrayList中的元素，使用interator.remove。
     * 说明：不会报错。ArrayList的删除是二次方增长，LinkedList的删除是线性增长。
     * */
    private static void removeIterator(List<Integer> lst){
        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()){
            if (itr.next() == 0)
                itr.remove();
        }
        System.out.println("removeIterator: "+lst);
    }



    public static void main(String[] args) {
        init();
//        removeFor(arrayList);
//        removeForHigh(arrayList);
        removeIterator(arrayList);
        stack.listIterator(3);
    }
}
