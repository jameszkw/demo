package com.james.secu.asymmetricencryption;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import com.james.secu.coderutil.CodeUtils;
import com.james.secu.symmetricencryption.AES;

/**
 * @TODO asymmetric
 * @author user
 *
 */
public class RSA {
	
	public static Map<String,String> getKeyPairStr() throws Exception{
		KeyPair keyPair = getKeyPair();
		Map<String,String> rtn = new HashMap<String,String>();
		rtn.put("publicKey", getPublicKey(keyPair));
		rtn.put("privateKey", getPrivateKey(keyPair));
		return rtn;
	}
	/**
	 * @todo get key pair
	 * @return
	 * @throws Exception
	 */
	private static KeyPair getKeyPair() throws Exception{
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(512);//512 1024 2048 
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		return keyPair;
	}
	/**
	 * @todo get public key
	 * @param keyPair
	 * @return
	 */
	private static String getPublicKey(KeyPair keyPair){
		PublicKey publicKey = keyPair.getPublic();
		byte[] bytes = publicKey.getEncoded();
		return CodeUtils.byte2base64(bytes);
	}
	/**
	 * @todo get private key
	 * @param keyPair
	 * @return
	 */
	private static String getPrivateKey(KeyPair keyPair){
		PrivateKey privateKey = keyPair.getPrivate();
		byte[] bytes = privateKey.getEncoded();
		return CodeUtils.byte2base64(bytes);
	}
	
	public static PublicKey string2PublicKey(String pubStr) throws Exception{
		byte[] keyBytes = CodeUtils.base642byte(pubStr);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = keyFactory.generatePublic(keySpec);
		return publicKey;
	}
	
	public static PrivateKey string2PrivateKey(String priStr) throws Exception{
		byte[] keyBytes = CodeUtils.base642byte(priStr);
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
		return privateKey;
	}
	
	public static String publicEncrypt(byte[] content,PublicKey publicKey) throws Exception{
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] bytes = cipher.doFinal(content);
		return CodeUtils.byte2base64(bytes);
	}
	
	public static byte[] privateDecrypt(String content,PrivateKey privateKey) throws Exception{
		byte[] contentBytes = CodeUtils.base642byte(content);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] bytes = cipher.doFinal(contentBytes);
		return bytes;
	}
	
	public static void main(String[] args) {
		try {
//			Map<String,String> keyPair = getKeyPairStr();
//			String publicKey = keyPair.get("publicKey");
//			String privateKey = keyPair.get("privateKey");
//			System.out.println("publicKey:"+publicKey);
//			String str = "h";
//			String strEncrypt = publicEncrypt(str.getBytes(),string2PublicKey(publicKey));
//			System.out.println("strEncrypt:"+strEncrypt);
//			String strDecrypt = new String(privateDecrypt(strEncrypt, string2PrivateKey(privateKey)));
//			System.out.println("result:"+strDecrypt);
			String yibao = new String(privateDecrypt("cvEWchvmbPgpaK4U2Hmohow8U6Q29EGaFbJbjP6eMI0JriHEZb7GobaFl4JXR2u7VjsvDe9GDXEB7KfogxkC4RhmVQtkV8CeEoPNPpyDWFd7NTm+jbapa8MGF/CsTC+aAw+wps30FX+Ay9jv2jB/62nL2d2HERRvssKYS8dF/a8=",string2PrivateKey("MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAJhN9AZDnWSfPmQLg+6WkzLBmkM2hwOpJmu1306Jp72JZJ2zBjwccpd7tHLllh4TDD18927AN3OsSP3qDXCspkkhnCeH+5hE9icRupzZL1bU1qoBgoeg0vqSaN4W3qRbAy5+TyzNzP2wNtLw/lSVS2GNNM7UscPMjowm2a/3x1apAgMBAAECgYEAhw5hPQjKUkcP6WF4vaKSpyic5cs9kJZ3dn4RpjBVKbLjISB2f+luCDxvOI+0PbkAWqotM+2Jfq6hD2B0SJ0g2kybjWumnDXAbGbAa5xaC98CImoIoyH4njja/06gvjWoEngSVdOUS/4cCZEMxraRgvW2py4ky8ClqmBlqkOrTn0CQQDFxX2YBzaBVaDcb54ggpB/pR1u/hPvJsNumpN7j6v/sKXVF0O+F0IOd+fL5RlMnc6pDckAfFD5I2bOob9zAeHHAkEAxSWChRwaWQa3bxaOOvuCgOIF0QHgXlok1bLh54vutljoS1EOD1E6n5vz3dYfHc6Xf3e7lAJyfTbPLC0yc7wEDwJBAIWyTIVJ2v7z9BsRGcTAfw7LgGpYOQGjItrShIEzTwM7V+AGKjWHY5CEXp7n8YJp7Bs8xnUdlV/XHtjxX4tP6mECQGzMrqNXRxMqqcEc6ZGTjAoksqEOMAziIsHs3s8yYqMvncMzEFdTtM6w+nzK1pFUmjc2lMayMwz3Wo4+w0Er2fECQQCGJ29lig4Tjf1RbeehxLrBUr4jqSPih6sE17ebaXVjkQmgATZkTW4RI4LsOaNQKGN5hO3o4ZHbvxHq6yVlpQ0T")));
			System.out.println("yibao:"+yibao);
//			SecretKey key = AES.loadKeyAES("yR9d7pXmsNU79iFO");
//			String data = CodeUtils.byte2base64(AES.decryptAES("C6PiH2Wf2pthVw1ujjS7k+fhWquGN+Tz23Ro0/N3G8e5p25TGDffkKL6NMAZZfTf4KhEE+qKKwNKYvbGc9E+BWGT8tk0y3QyxDgYaTjE8RKQThtD8T8DEXJASmHLeZViTxA3u/K/zFS0G9lhgZZYgZ/XDg8VLtQ8bBEewk7n8MmpnO6KCstZe+KNM83U0S6qCd3faUne+cqfEWnpY1f7wgUF0dk7otxCClTbtgwznfQUrrNYZHSNHSZRmhhmDMGMzRtF5x/cAWjN3TUXUVxj0BdgG/pdyJg+IMle/+iRXmFKUHeqmZcCdAG+GCfeggKo6vtAeuYUB6BV14Oa1Ll7Rw==".getBytes(),key ));
			
//			System.out.println(data);
//			String sign = new String(privateDecrypt("DBZ+po09COaxQvVn61itlgZgw8f1Yf5P4f9xTMNkIQP+9zcwhqC58MUtjJLDpWRyy1JGBJPF1w1W3GZx8iCUiqWa3Oc2vYIDNkICUA31Q+qjr1+pvuhOdjqwIK3vln/MEErS5O8H4HLJKkagbkClK3414d7Yg7QS/nNcTWQeWaQ=",string2PrivateKey("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCScsMzVFgNItih8VaK5xSWtuB4hd9nt3dJ8q6QPWYq563ZwAhsERsm3cI85xKO+QhqYsOmMaG119ZDfU0A1CCSeOJteHJuxy4IbXM8Q4vb9Aj6SdxyGGWUaVw0JJwGTpeJ5lfKAIM7Qilaz+4XLdH/6bpH5s0hrqPlOyptr5XfrQIDAQAB")));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
