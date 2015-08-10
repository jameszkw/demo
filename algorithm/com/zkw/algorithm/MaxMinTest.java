package com.zkw.algorithm;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-7-1 下午5:56:06
 * 
 */
public class MaxMinTest {
	public static void main(String[] args) {
		MaxMinTest s = new MaxMinTest();
		double[] d = { 1, 6.52, 2, 3.5, 9.3, 7, 8, 2.1 };
		System.out.println("最大值是：" + s.getMax(d));
		System.out.println("最小值是：" + s.getMin(d));
	}

	public double getMax(double[] d) {
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

	public double getMin(double[] d) {
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
}
