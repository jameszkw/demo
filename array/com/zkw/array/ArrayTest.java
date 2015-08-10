package com.zkw.array;

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
	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
		Double[] d = { 1.3, 6.52, 2.0, 3.5, 9.3, 7.0, 8.0, 2.1 };
		a.getMax(d);
		a.getMin(d);
		System.out.println(a.getMax(d));
		
	}
}
