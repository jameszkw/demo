package com.zkw.math.percent;

import java.text.DecimalFormat;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-7-17 下午6:02:22
 *
 */
public class Percent {
	public static void main(String[] args) {
		double d = 0.45098039215686275;
		System.out.println(d*100);
		DecimalFormat df = new DecimalFormat("#");
		System.out.println(df.format(d*100));
		
	}
}
