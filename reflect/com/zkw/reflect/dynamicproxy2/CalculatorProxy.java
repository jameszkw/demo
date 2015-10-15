package com.zkw.reflect.dynamicproxy2;

/**
 * @ClassName: CalculatorProxy
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午5:17:10
 *
 */
public class CalculatorProxy implements Calculator{
	private Calculator calculator;
	public CalculatorProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int add(int a, int b) {
		//执行前可以做的工作
		int result = calculator.add(a, b);
		//执行后可以做的工作
		return result;
		
	}
}
