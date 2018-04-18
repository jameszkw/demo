package com.zkw.security.digitalsignature;

import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

import com.zkw.security.coderutil.CodeUtils;

public class SHA1withRSA {
	private static byte[] sign(byte[] content,PrivateKey privateKey)throws Exception{
		MessageDigest md = MessageDigest.getInstance("SHA1");
		byte[] bytes = md.digest(content);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] encryptBytes = cipher.doFinal(bytes);
		return encryptBytes;
	}
	
	private static boolean verify(byte[] content,byte[] sign,PublicKey publicKey)throws Exception{
		MessageDigest md = MessageDigest.getInstance("SHA1");
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
