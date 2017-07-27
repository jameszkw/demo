package com.zkw.algorithm.algorithm;

/**
 * 排序算法测试类
 *
 * @author James
 * @create 2017-07-20 下午 3:14
 **/

public class Client {
    static Sort sort;
    static Integer[] ints = new Integer[]{2,4,1,6,9,0};

    /**
     * 选择排序
     */
    static void selectionSort(){
        sort = new SelectionSort();
        sort.sort(ints);
        sort.show(ints);
    }

    /**
     * 插入排序
     */
    static void insertionSort(){
        sort = new InsertionSort();
        sort.sort(ints);
        sort.show(ints);
    }
    public static void main(String[] args) {
//        selectionSort();
        insertionSort();
    }
}
