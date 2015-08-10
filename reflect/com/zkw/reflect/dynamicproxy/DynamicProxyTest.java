package com.zkw.reflect.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	public static void main(String[] args) {
		Invoker invoker1 = new Invoker(new ClassA());
		AbstractVClass ac1 = (AbstractVClass) Proxy.newProxyInstance(AbstractVClass.class.getClassLoader(), new Class[]{AbstractVClass.class}, invoker1);
		ac1.show();
	}
}
