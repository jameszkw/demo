package com.zkw.algorithm.algorithms_4th_book.C2.c2_1_1;

import com.zkw.asm.guide.Comparable;

/**
 * 排序算法类的模板
 * 此类展示的是数组排序实现的框架，对于我们学习的每种排序算法，我们都会为这样一个类实现一个sort()方法并将Example改为算法名称
 * @author James
 * @create 2017-09-19 下午 4:43
 **/

public class Example {
    public static void sort(Comparable[] a){/*在此实现各种排序算法*/}
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    private static void show(Comparable[] a){
        //在单行中打印数组
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a){
        //测试数组元素是否有序
        for (int i=1;i<a.length;i++){
            if (less(a[i],a[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //
    }
}
