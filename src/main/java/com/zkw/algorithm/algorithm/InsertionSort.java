package com.zkw.algorithm.algorithm;

/**
 * 插入排序
 * 说明：
 * 部分有序的数组：数组中每个元素距离它的最终位置都不远。一个有序的大数组接一个小数组。数组中只有几个元素的位置
 *  不正确。
 * @author James
 * @create 2017-07-20 下午 3:22
 **/

public class InsertionSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0;i<N;i++){
            //将a[i]插入到a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
}
