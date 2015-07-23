package com.james.secu.symmetricencryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.james.secu.coderutil.CodeUtils;

/**
 * @author user
 * @todo Data Encryptin Standard
 */
public class DES {
	
	/**@todo generate secret key
	 * @return
	 * @throws Exception
	 */
	public static SecretKey genSecretKey() throws Exception{
		String base64Key = genKeyDES();
		return loadKeyDES(base64Key);
	}
	
	private static String genKeyDES() throws Exception{
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56);
		SecretKey key = keyGen.generateKey();
		String base64Str = CodeUtils.byte2base64(key.getEncoded());
		return base64Str;
	}
	
	private static SecretKey loadKeyDES(String base64Key) throws Exception{
		byte[] bytes = CodeUtils.base642byte(base64Key);
		SecretKey key = new SecretKeySpec(bytes,"DES");
		return key;
	}
	
	/**
	 * @todo encrypt DES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptDES(byte[] source,SecretKey key) throws Exception{
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}
	
	/**
	 * @todo dncrypt DES
	 * @param source
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptDES(byte[] source,SecretKey  key) throws Exception{
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] bytes = cipher.doFinal(source);
		return bytes;
	}
	
	public static void main(String[] args) {
		try {
			String demo = "hello,i am james,good night!";
			SecretKey key = genSecretKey();
			byte[] encryptDemo = encryptDES(demo.getBytes(),key);
			//encrypt
			System.out.println(CodeUtils.byte2base64(encryptDemo));
			//decrypt
			String decrpteDemo = new String(decryptDES(encryptDemo,key));
			System.out.println(decrpteDemo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
