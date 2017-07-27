package com.zkw.byte_char.byteToString;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-27 下午5:01:36
 *
 */
public class ByteTransString {
	
	public static String toStringHex1(String s) {  
		   byte[] baKeyword = new byte[s.length() / 2];  
		   for (int i = 0; i < baKeyword.length; i++) {  
		    try {  
		     baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(  
		       i * 2, i * 2 + 2), 16));  
		    } catch (Exception e) {  
		     e.printStackTrace();  
		    }  
		   }  
		   try {  
		    s = new String(baKeyword, "utf-8");// UTF-16le:Not  
		   } catch (Exception e1) {  
		    e1.printStackTrace();  
		   }  
		   return s;  
		}  
	
	public static void main(String[] args) {
		System.out.println(toStringHex1("19"));
		System.out.println(Integer.toHexString(19));
	}
}
