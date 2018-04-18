package com.zkw.algorithm.algorithm;

/**
 * 排序算法类的模板
 * 数组排序实现的框架，每种不同的算法需要实现sort(),但适用于实现了Comparable接口的数据类型
 * @author James
 * @create 2017-07-20 上午 10:08
 **/

public abstract class Sort {
    /**
     * 排序
     * */
    public abstract void sort(Comparable[] a);
    /**
     * 对元素进行比较
     * */
    static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    /**
     * 将元素交换位置
     * */
    static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void show(Comparable[] a){
        //在单行中打印数组
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        //测试数组元素是否有序
        for (int i = 1;i<a.length;i++){
            if (less(a[i],a[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
