package com.zkw.math.rate;

import java.text.DecimalFormat;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-8 下午3:16:17
 *
 */
public class RateTest {
	public static void main(String[] args) {
		double rate = 30d/43d*100;
		double rateInt = 30*1.0/43*1.0*100;
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.println(rate);
		System.out.println(rateInt);
		System.out.println(df.format(rate));
	}
}
