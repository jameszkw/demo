package com.zkw.byte_char.byteToHex;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-28 下午7:22:54
 *
 */
public class ByteToHexTest {
	// 把byte 转化为两位十六进制数  
    public static String toHex(byte b) {
        String result = Integer.toHexString(b & 0xFF);  
        if (result.length() == 1) {
            result = '0' + result;  
        }
        return result;  
    }
    public static void byteTransHex(byte b){
        System.out.println(toHex(b));
    }
    
	
//	public static void main(String[] args) {
//		testHex4();
//	}
	
   
}
