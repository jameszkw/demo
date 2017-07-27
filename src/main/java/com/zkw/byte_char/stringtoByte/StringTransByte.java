package com.zkw.byte_char.stringtoByte;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-27 下午8:27:35
 *
 */
public class StringTransByte {
	public static void main(String[] args) {
		byte[] buf = {(char)0x02};
		System.out.println(buf[0]);
//		System.out.println(Byte.valueOf(0x08));
		
		System.out.println((char)0xf0);
		
	}
}
