package com.zkw.array;

import java.util.Arrays;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-7-2 上午9:35:17
 *
 */
public class ArrayTest {
	public double getMax(Double[] d) {
		for (int i = 0; i < d.length - 1; i++) {
			if (d[i] > d[i + 1]) {
				double temp = 0;
				temp = d[i];
				d[i] = d[i + 1];
				d[i + 1] = temp;
			}
		}
		return d[d.length - 1];
	}

	public double getMin(Double[] d) {
		for (int i = 0; i < d.length - 1; i++) {
			if (d[i] < d[i + 1]) {
				double temp = 0;
				temp = d[i];
				d[i] = d[i + 1];
				d[i + 1] = temp;
			}
		}
		return d[d.length - 1];
	}

	private static void copyTest(){
		int[] arr = {1,2,3,4};
		int[] arr1 = Arrays.copyOf(arr,arr.length+1);
		for (int i:arr1){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		copyTest();
	}
}
