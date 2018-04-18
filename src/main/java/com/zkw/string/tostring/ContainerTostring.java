package com.zkw.string.tostring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerTostring {
	private static void toStringTest(){
		StringBuffer sb =  new StringBuffer();
		sb.append("first");
		sb.append("sec");
		sb.append("thr");
		sb.append("forth");
		sb.append("fifth");
		System.out.println(sb.toString());
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("first", "f");
		map.put("sec", "s");
		map.put("thr", "f");
		map.put("forth", "f");
		System.out.println(map.toString());
		
		List<String> list = new ArrayList<String>();
		list.add("first");
		list.add("first");
		list.add("first");
		list.add("first");
		System.out.println(list.toString());
	}
	public static void main(String[] args) {
		toStringTest();
	}
}
