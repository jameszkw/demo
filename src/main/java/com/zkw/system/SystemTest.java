package com.zkw.system;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-6 上午11:53:42
 *
 */
public class SystemTest {
	private static void getEnvDemo(){
		System.out.println(System.getenv("PORT"));
	}
	private static void getPropertyDemo(){
		String dir = System.getProperty("os.name");
		System.out.println(dir);
	}
	public static void main(String[] args) {
		getEnvDemo();
	}
}
