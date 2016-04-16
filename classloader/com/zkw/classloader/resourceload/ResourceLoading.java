package com.zkw.classloader.resourceload;

/**
 * @ClassName: ResourceLoading
 * @Description: 3种加载资源方法
 * @author James.zhang
 * @date 2015年10月23日 上午11:27:36
 *
 */
public class ResourceLoading {
	public static void main(String[] args) {
		//first
		try {
			Class cls = Class.forName("com.zkw.classloader.resourceload.Test");
			Test test = (Test)cls.newInstance();
			test.echo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//second
		try {
			ClassLoader cl = new ClassLoader() {
				
			};
			Class cls = cl.loadClass("com.zkw.classloader.resourceload.Test");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//third
		Test test = new Test();
		test.echo();
	}
}
