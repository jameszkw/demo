package com.zkw.string.substing;

public class Subassert {
	public static void main(String[] args) {
		String assertInfo = "[";
		assertInfo += "{\"matchBody\":\""+ "status"+ "\",\"propertyName\":\""+ 1+ "\",\"compareMethod\":\""
				+ 1+ "\",\"expectedVal\":\""+ 1+ "\",\"realValue\":\""+ 1+ "\",\"compareResult\":\""
				+ 1+ "\"}";
		assertInfo = assertInfo.substring(0,(assertInfo.length() - 1))+ "]";
		System.out.println(assertInfo);
	}
}
