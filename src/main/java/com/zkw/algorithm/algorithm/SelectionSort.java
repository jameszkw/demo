package com.zkw.algorithm.algorithm;

/**
 * 选择排序
 * 说明：首先，找到数组中最小的元素。其次，将它和数组第一个元素交换位置。再次，将剩下的元素中
 * 找到最小的元素，将它与第二个元素交换位置。
 * 运行时间与输入无关。
 * @author James
 * @create 2017-07-20 上午 11:07
 **/

public class SelectionSort extends Sort {

    /**
     * 将a[]按升序排序
     * */
    public void sort(Comparable[] a){
        int N = a.length;//数组长度
        for (int i = 0;i < N;i++){
            int min = i;//最小元素的索引
            for (int j = i+1;j<N;j++){
                if (less(a[j],a[min])) min = j;
            }
            exch(a,i,min);
        }
    }
}
