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
			String decrpteDemo = new String(decryptAES("Swm1/FM8Quf8IUpZ5PoefDnxBHgNceGvvPd/1nemxvGYYXBGwyr6PISUFohLfh10I0OIy34XqUnYh5c7+h0+UHrKYqnwjZ49igNfOJTlnehm//aRXqszF0lDKLBP47cAI8nvqGSdo0/NMN8z2UHLIlUzXuMx9hritjaveb4H+S7MlNlXa3bJysmZQ0LRnmgKP+p83BH0rVJzJvWbYmUHGScYjXw3jyNsSFrX5/sCohxyHwj7tDl1X8dKUUhQ8nny358CTKypC4H46IhlEQUvPZQzASM7SCsv5AKnStoW7WrJgtIxJ6pyMc+L50Ks47Z0L+Wa/UzUx9mKOGtgGCAW2J0m6JDZ5KCEM5GsUj29/s4=","yR9d7pXmsNU79iFO"));
			System.out.println(decrpteDemo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
