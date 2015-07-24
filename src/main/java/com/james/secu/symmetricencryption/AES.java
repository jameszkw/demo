package com.james.secu.symmetricencryption;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.james.secu.coderutil.CodeUtils;

/**
 * @author user
 * @todo Advanced Encryption Standard
 * @description better then DES.There are three kinds of length(128,192,256).
 *              if use 192,256 need limit document.
 */
public class AES {
	
	/**@todo generate secret key
	 * @return
	 * @throws Exception
	 */
	private static Key genSecretKey(String keyStr) throws Exception{
		byte[] keyAsBytes;
		keyAsBytes = keyStr.getBytes("UTF-8");
		Key key = new SecretKeySpec(keyAsBytes, "AES");
		return key;
	}
	
	/**
	 * @todo encrypt AES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encryptAES(byte[] source,String keyStr) throws Exception{
		Key key = genSecretKey(keyStr);
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encValue = c.doFinal(source);
		String encryptedValue = CodeUtils.byte2base64(encValue);
		return encryptedValue;
	}
	
	/**
	 * @todo dncrypt AES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decryptAES(String encryptedValue,String keyStr) throws Exception{
		Key key = genSecretKey(keyStr);
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = CodeUtils.base642byte(encryptedValue);
		byte[] decValue = c.doFinal(decordedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}
	
	public static void main(String[] args) {
		try {
//			String demo = "hello,i am james,good night!";
//			String encryptDemo = encryptAES(demo.getBytes(),"U4b6CL23wfpULFdU");
//			//encrypt
//			System.out.println(encryptDemo);
//			//decrypt
//			String decrpteDemo = new String(decryptAES(encryptDemo,"U4b6CL23wfpULFdU"));
			String decrpteDemo = new String(decryptAES("9jXAL9b7EWNazyVScbxML6595I+kbYSEE+csuGzMitbeqWLR0StHSF6LydPp3PzQf3WJpxa4KHUfyzp/zFX7VsNl0npfmAmQACYmxNhrnzZ3Xj5odmU6yqd2p9Cfa6R6AOFO1j0jP3IuuNvsUF5PBP06xZtth7eMFwGo2uKnLy+WCkm4v67ZX4A+Rm7rFQw9sdRir1ZO90SrkfcVzxvXR92mJgAyJE1eGVQH5QignYKpQEPhewSCZnW6CyD+Zck9BDpWdHwUh1pms7qRL+Jv5hMeW9xtlbfgsM0+NCEPdkKavBFBpTq0Tl6EBcU4WgVPMEHkmuS8VMdPN0uz3ysv4g==","U91zXgc00spsBxOo"));
			System.out.println(decrpteDemo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
