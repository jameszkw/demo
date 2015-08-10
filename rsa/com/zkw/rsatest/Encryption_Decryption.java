package com.zkw.rsatest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;

public class Encryption_Decryption {
	private void genKeyPairsEncrypt(byte[] data) throws Exception{
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
//		return cipherData;
		
		decryptData(cipherData,priv);
	}
	
	/**
	 * Encrypt Data
	 * 
	 * @param data
	 * @throws IOException
	 */
	private void decryptData(byte[] data,RSAPrivateKeySpec keySpec) throws IOException {
		System.out.println("\n----------------DECRYPTION STARTED------------");
		byte[] descryptedData = null;
		
		try {
//			String priKey = "";
//			BigInteger modulus = new BigInteger(priKey);
//			BigInteger privateExponent = new BigInteger("65537");
//			RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(modulus,
//					privateExponent);
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PrivateKey key = keyFactory.generatePrivate(keySpec);

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, key);
			descryptedData = cipher.doFinal(data);
			System.out.println("Decrypted Data: " + new String(descryptedData));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----------------DECRYPTION COMPLETED------------");
	}
	
	public static void main(String[] args) {
		try {
			Encryption_Decryption d = new Encryption_Decryption();
			d.genKeyPairsEncrypt("f".getBytes());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
