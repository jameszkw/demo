package com.zkw.reflect.dynamicproxy2;

/**
 * @ClassName: CalculatorImpl
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午5:16:20
 *
 */
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
}
