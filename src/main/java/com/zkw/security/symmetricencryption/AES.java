package com.zkw.security.symmetricencryption;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.zkw.security.coderutil.CodeUtils;

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
			String decrpteDemo = new String(decryptAES("FQDTduqAg8DHW/MUrqIFPRjm+5826TXd+iV9DbuLEFzTVfMMHNTI9J6IKGHmfLxmrbSrh8VuLrQge2Z+N20aW7wvJkecYqa91RuHpLmnvyfghiuktfVgoj/nQdcDQ+CsO7MZYr2oi179i3hdzVVOgDZNhb2tluACVsGRAj+Sea6jEaQXhSG9u1sdBlThgYGpIM4qwKg1AKZNKeajZIQvgg1DLKVzL7W+yNt3dy4a4nWewrX9Ph7dJf3gYkRDsg7+GLyinvyswbDN6y2gwWWT4i9oTYg9pvpnTAM/OkVeO422hHaZpw+y8feH7sm7JOTn4v75liMXjKPHNlp7nfVcdnh6IL5a+R6bSE+hvYhnJhvGGX9BGMwBJTr8aeMwLDeqetz/LtOtvn7psY/LmchvVm2mZ639kHgmwwF/PQazG13wXPB4A4fW/OArkdY09IaC0uNQTnBwKyILrMVj1iiWGtt7F1Z2MMKGicUnfPuF3KNgJ7vsSlJSFhkUlneP9mynmW7+nte4N0+vh5Z9+5uEJ2pMxENOD2kKeriu6lMe8/HzwekCxaNHxFzF45FKbdsrroI/hj7s5HkEoyXKJShxi7538AkJkhdxHMBayGHXIb7ujn/FCoSaj+Xla/YYzEjUUsonSOUa7qSoK8d5YvsAy/2HXRQ3ljQKmNu1wvBhCMBvK84t/wJBvG8Y4hbo7yq1CjlOawLw6HRpqdRhXyrhPWVtjXoWdXrRLDbTKk3T/nAcoCWJ8OKm8ohPf/74Sva7M+xyP5nZROTffo02sQGvqpnkZtSU2sWLyYIAOlMpzWNyORp0BUzeUxR8bKn9bdLytmOvpqz4uXZMtnyaCuQWvJ/aC4pjgOQqjzKkDE1XQTCvjnEVbb/FtD2v0B6HVPtCSQCnAftRSAR0WCW0qnfglyoM/qhdTee53KXoDmJZ8XMgdUKHQUyNP6NsO+Tl8LODmK6flZt1cW4y1/9fT+yKlGydLwzWbdEG5BA6iR6Ke+vYicw8xJdjbK00O5Yo9bMEYwyfF7DPMOdHJWWLgEBpu/DzKDvk3XORUQd+8SNWh1K9JBSvg/chWPLo39wqWNXydu0xY3CTARagFjzeI0b/ZsoHiwOirOgLgSBDeCuNEtlhR67VufY8W/8EFJoEkuNqS8UB0B8nDrdIkZhPK82GF51yTILomyVroLNpctmvEw/DDjzNWBQ0/3A18s52poDM0ZBr8OaYCO3mpxRAZeQHHC4E+qdbYcvAs5UoVJzKawWNI2bpsNDCMJ6F8KuzFi/z8/hLSRC09T1xI/92aC78Gw==","1234567890123456"));
			System.out.println(decrpteDemo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
