package com.zkw.reflect.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Invoker implements InvocationHandler {
	AbstractVClass ac;
	public Invoker(AbstractVClass ac) {
		this.ac = ac;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用之前可以做一些处理
		method.invoke(ac, args);
		//调用之后也可以做一些处理
		return null;
	}
	
}
