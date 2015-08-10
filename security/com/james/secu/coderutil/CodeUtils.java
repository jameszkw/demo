package com.james.secu.coderutil;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class CodeUtils {
	/**
	 * @todo byte to base64
	 * @param bytes
	 * @return
	 */
	public static String byte2base64(byte[] bytes){
		BASE64Encoder base64Encoder = new BASE64Encoder();
		return base64Encoder.encode(bytes);
	}
	
	/**
	 * @todo base64 to byte
	 * @param base64
	 * @return
	 * @throws IOException
	 */
	public static byte[] base642byte(String base64) throws IOException{
		BASE64Decoder base64Decoder = new BASE64Decoder();
		return base64Decoder.decodeBuffer(base64);
	}
	
	/**
	 * 不咋对
	 * @param bytes
	 * @return
	 */
	public static String bytes2hex(byte[] bytes){
		StringBuilder hex = new StringBuilder();
		for (int i = 0;i<bytes.length;i++){
			byte b = bytes[i];
			boolean negative = false;
			if (b<0) negative = true;
			int inte = Math.abs(b);
			if(negative) inte = inte | 0x80;
			//负数会转成正数（最高位的负号变成数值计算），再转十六进制
			String temp = Integer.toHexString(inte & 0xFF);
			if(temp.length() == 1){
				hex.append("0");
			}
			hex.append(temp.toLowerCase());
		}
		return hex.toString();
	}
	
	public static byte[] hex2bytes(String hex){
		byte[] bytes = new byte[hex.length()/2];
		for(int i = 0;i<hex.length();i=i+2){
			String subStr = hex.substring(i,i+2);
			boolean negative = false;//是否为负数
			int inte = Integer.parseInt(subStr,16);
			if (inte >127) negative = true;
			if(inte == 128){
				inte = -128;
			}else if(negative){
				inte = 0-(inte & 0x7F);
			}
			byte b = (byte)inte;
			bytes[i/2] = b;
		}
		return bytes;
	}
	
	public static void main(String[] args) {
		
	}
}
