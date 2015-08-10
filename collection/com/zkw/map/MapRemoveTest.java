package com.zkw.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-14 下午2:43:20
 *
 */
public class MapRemoveTest {
	public static void main(String[] args) {
		Map<String,Map<String,String>> map1= new ConcurrentHashMap<String,Map<String,String>>();
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("key2", "value2");
		map1.put("key1", map2);
//		map2.remove("key3");
		System.out.println(map1.get("key1").remove("key2"));
		System.out.println(map1.get("key1").isEmpty());
		System.out.println(map1);
		System.out.println(map2);
		
	}
}
