package com.zkw.reflect.staticproxy;

/**
 * @ClassName: CalculatorImpl
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午5:16:20
 *
 */
public class CalculatorImpl2 implements Calculator {

	@Override
	public int add(int a, int b) {
		System.out.println("CalculatorImpl2 add() result:"+a+b);
		return a+b;
	}
	
}
