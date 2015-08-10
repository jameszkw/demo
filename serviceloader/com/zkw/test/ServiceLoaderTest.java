package com.zkw.test;

import java.util.ServiceLoader;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-6-19 下午2:23:20
 *
 */
public class ServiceLoaderTest {
	public static void main(String[] args) {
		ServiceLoader<IService> serviceLoader = ServiceLoader.load(IService.class);
		for (IService service : serviceLoader) {
			System.out.println(service.getScheme()+"="+service.sayHello());   
	    }
	}
}
