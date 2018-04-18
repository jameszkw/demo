package com.zkw.security.symmetricencryption;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Test {

	private static final String ALGORITHM = "AES";
	private static final String myEncryptionKey = "U4b6CL23wfpULFdU";
	private static final String UNICODE_FORMAT = "UTF8";

	public static String encrypt(String valueToEnc) throws Exception {
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGORITHM);
		c.init(Cipher.ENCRYPT_MODE, key); // ////////LINE 20
		byte[] encValue = c.doFinal(valueToEnc.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encValue);
		return encryptedValue;
	}

	public static String decrypt(String encryptedValue) throws Exception {
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGORITHM);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
		byte[] decValue = c.doFinal(decordedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}

	private static Key generateKey() throws Exception {
		byte[] keyAsBytes;
		keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
		Key key = new SecretKeySpec(keyAsBytes, ALGORITHM);
		return key;
	}

	public static void main(String[] args) throws Exception {

		String value = "C6PiH2Wf2pthVw1ujjS7k+fhWquGN+Tz23Ro0/N3G8e5p25TGDffkKL6NMAZZfTf4KhEE+qKKwNKYvbGc9E+BWGT8tk0y3QyxDgYaTjE8RKQThtD8T8DEXJASmHLeZViTxA3u/K/zFS0G9lhgZZYgZ/XDg8VLtQ8bBEewk7n8MmpnO6KCstZe+KNM83U0S6qCd3faUne+cqfEWnpY1f7wgUF0dk7otxCClTbtgwznfQUrrNYZHSNHSZRmhhmDMGMzRtF5x/cAWjN3TUXUVxj0BdgG/pdyJg+IMle/+iRXmFKUHeqmZcCdAG+GCfeggKo6vtAeuYUB6BV14Oa1Ll7Rw==";
		String valueEnc = Test.encrypt(value);
		String valueDec = Test.decrypt(valueEnc);

		System.out.println("Plain Text : " + value);
		System.out.println("Encrypted : " + valueEnc);
		System.out.println("Decrypted : " + valueDec);
	}

}
