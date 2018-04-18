package com.zkw.reflect.staticproxy;

/**
 * @ClassName: MainServer
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月22日 下午6:57:01
 *
 */
public class MainServer {
	public static void main(String[] args) {
		Calculator proxy = CalculatorStaticFactory.getInstance();  
		proxy.add(1, 2);
	}
}
