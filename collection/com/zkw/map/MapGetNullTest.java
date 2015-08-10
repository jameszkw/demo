package com.zkw.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-15 上午11:34:53
 *
 */
public class MapGetNullTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("123", "f");
		System.out.println(map.get("dd"));
		
		Map<String,Map<String,String>> map1 = new HashMap<String,Map<String,String>>();
		map1.put("ff", map);
		System.out.println(map1.get("dd"));
		
		
		
	}
}
