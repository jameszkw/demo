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
}
