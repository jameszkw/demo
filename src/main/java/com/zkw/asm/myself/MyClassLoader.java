package com.zkw.asm.myself;

/**
 * @ClassName: MyClassLoader
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月19日 下午3:26:14
 *
 */
public class MyClassLoader extends ClassLoader {
	@SuppressWarnings("unchecked")
	public Class defineClassByName(String name, byte[] b, int off, int len) {
		Class clazz = super.defineClass(name, b, off, len);
		return clazz;
	}
}
