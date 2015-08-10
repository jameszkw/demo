package com.james.secu.digitaldigest;

import java.security.MessageDigest;

import com.james.secu.coderutil.CodeUtils;

public class Sha1 {
	public static String sha1(String content)throws Exception{
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] bytes = md.digest(content.getBytes("utf-8"));
		return CodeUtils.bytes2hex(bytes);
	}
	public static void main(String[] args) {
		try {
			System.out.println(sha1("ActionCreateUHostInstanceCPU2ChargeTypeMonthDiskSpace10ImageIdf43736e1-65a5-4bea-ad2e-8a46e18883c2LoginModePasswordMemory2048NameHost01PasswordVUNsb3VkLmNuPublicKeyucloudsomeone@example.com1296235120854146120Quantity1Regioncn-north-0146f09bb9fab4f12dfc160dae12273d5332b5debe"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
