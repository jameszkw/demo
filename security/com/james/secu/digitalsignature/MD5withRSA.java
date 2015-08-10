package com.james.secu.digitalsignature;

import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

import com.james.secu.coderutil.CodeUtils;

public class MD5withRSA {
	private static byte[] sign(byte[] content,PrivateKey privatekey)throws Exception{
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] bytes = md.digest(content);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privatekey);
		byte[] encryptBytes = cipher.doFinal(bytes);
		return encryptBytes;
	}
	
	private static 	boolean verify(byte[] content,byte[] sign,PublicKey publicKey)throws Exception{
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] bytes = md.digest(content);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decryptBytes = cipher.doFinal(sign);
		if(CodeUtils.byte2base64(decryptBytes).equals(CodeUtils.byte2base64(bytes))){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
