package com.zkw.reflect.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: LogHandler
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午5:28:55
 *
 */
public class LogHandler implements InvocationHandler{
	Object obj;
	public LogHandler(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		this.doBefore();
		Object o = method.invoke(obj, args);
		this.doAfter();
		return o;
	}
	
	public void doBefore(){
		System.out.println("before process");
	}
	
	public void doAfter(){
		System.out.println("after process");
	}
}
