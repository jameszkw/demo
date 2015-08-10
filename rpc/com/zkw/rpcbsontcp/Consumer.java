package com.zkw.rpcbsontcp;

import java.lang.reflect.Method;

public class Consumer {
	private void test() throws NoSuchMethodException, SecurityException{
		String interfacename = SayHelloService.class.getName();
		Method method = SayHelloService.class.getMethod("sayHello", java.lang.String.class);
	}
	
}
