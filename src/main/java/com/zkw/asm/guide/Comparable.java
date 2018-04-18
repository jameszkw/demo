package com.zkw.asm.guide;

/**
 * @ClassName: Comparable
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月27日 下午7:23:35
 *
 */
public interface Comparable extends A{
	int LESS = -1;
	int EQUAL = 0;
	int GREATER = 1;
	int compareTo(Object o);
}
