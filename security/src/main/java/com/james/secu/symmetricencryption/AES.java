package com.james.secu.symmetricencryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

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
	public static SecretKey genSecretKey() throws Exception{
		String base64Key = genKeyAES();
		return loadKeyAES(base64Key);
	}
	
	public static String genKeyAES() throws Exception{
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		SecretKey key = keyGen.generateKey();
		String base64Str = CodeUtils.byte2base64(key.getEncoded());
		return base64Str;
	}
	
	private static SecretKey loadKeyAES(String base64Key) throws Exception{
		byte[] bytes = CodeUtils.base642byte(base64Key);
		SecretKey key = new SecretKeySpec(bytes,"AES");
		return key;
	}
	
	/**
	 * @todo encrypt AES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptAES(byte[] source,SecretKey key) throws Exception{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}
	
	/**
	 * @todo dncrypt AES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptAES(byte[] source,SecretKey  key) throws Exception{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}
	
	public static void main(String[] args) {
		try {
			String demo = "hello,i am james,good night!";
			SecretKey key = genSecretKey();
			byte[] encryptDemo = encryptAES(demo.getBytes(),key);
			//encrypt
			System.out.println(CodeUtils.byte2base64(encryptDemo));
			//decrypt
			String decrpteDemo = new String(decryptAES(encryptDemo,key));
			System.out.println(decrpteDemo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
