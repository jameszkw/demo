package com.zkw.byte_char.byteToString;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-27 下午5:11:18
 *
 */
public class HexStringTest {
	
//	 public static String decode(String bytes) {
//         ByteArrayOutputStream baos=new ByteArrayOutputStream(bytes.length()/2);
//           //将每2位16进制整数组装成一个字节
//          for(int i=0;i<bytes.length();i+=2)
//                baos.write((hexString.indexOf(bytes.charAt(i))<<4 |hexString.indexOf(bytes.charAt(i+1))));
//           return new String(baos.toByteArray());
//}
	
	public static void main(String[] args) {
		
		String str="a";
		char c=(char)str.charAt(0);
		System.out.println(c+"转换为16进制为："+Integer.toString(c,16));
		System.out.println("16进制转换为字符为:"+(char)Integer.valueOf(Integer.toString(c, 16),16).intValue());
		System.out.println("16进制转换为字符为:"+(char)Integer.valueOf("77",16).intValue());
		
		String mes = "0x00,0x0A,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x3A,0x3B,0x3C,0x3D,0x01,0x1C,0x30,0x31,0x32,0x33";
		StringTokenizer stringTokenizer = new StringTokenizer(mes,",",false);
		while(stringTokenizer.hasMoreTokens()){
			char mesChar = (char)Integer.valueOf(stringTokenizer.nextToken().substring(2),16).intValue();
		}
		
		String str2 = "asdf";
		char[] mesChars = str2.toCharArray();
		for(char mesChar: mesChars){
			System.out.println(mesChar);
		}
		
		String hexStr = "65";
		byte bye = new Byte(hexStr);
	}
}
