package com.zkw.reflect.dynamicproxy2;

import java.lang.reflect.Proxy;

/**
 * @ClassName: Dynamic
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午5:27:44
 *
 */
public class MaiServer {
	public void testDynamicProxy(){
		Calculator calculator = new CalculatorImpl();
		LogHandler lh = new LogHandler(calculator);
		Calculator proxy = (Calculator)Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(), lh);
		System.out.println(proxy.add(1, 1));
	}
	public static void main(String[] args) {
		MaiServer dynamic = new MaiServer();
		dynamic.testDynamicProxy();
	}
}
