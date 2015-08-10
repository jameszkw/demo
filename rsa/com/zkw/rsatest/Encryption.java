package com.zkw.rsatest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Encryption {
	private byte[] keyPair(byte[] data) throws Exception{
		String algorithm  = "RSA";
		KeyPairGenerator kpg = KeyPairGenerator.getInstance(algorithm);
		kpg.initialize(2048);
		KeyPair kp = kpg.genKeyPair();
		KeyFactory fact = KeyFactory.getInstance(algorithm);
		RSAPublicKeySpec pub = fact.getKeySpec(kp.getPublic(),
				RSAPublicKeySpec.class);
		RSAPrivateKeySpec priv = fact.getKeySpec(kp.getPrivate(),
				RSAPrivateKeySpec.class);
		
//		RSAPublicKeySpec keySpec = new RSAPublicKeySpec(pub.getModulus(), pub.getPublicExponent());
		PublicKey pubKey = fact.generatePublic(pub);
		
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		byte[] cipherData = cipher.doFinal(data);
		
		System.out.println(pub.getModulus()+":"+pub.getPublicExponent());
		System.out.println(priv.getModulus()+":"+priv.getPrivateExponent());
		return cipherData;
	}
	
	public static void main(String[] args) {
		try {
			byte[] data = "f".getBytes();
			Encryption encry = new Encryption();
			System.out.println(encry.keyPair(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
