package com.zkw.asm.guide;

/**
 * @ClassName: MyClassLoader
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月27日 下午7:53:36
 *
 */
public class MyClassLoader extends ClassLoader {
	public Class defineClass(String name,byte[]b){
		return defineClass(name,b,0,b.length);
	}
}
