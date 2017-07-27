package com.zkw.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-10 下午7:02:33
 *
 */
public class MapKeySetTest {
	public static void main(String[] args) {
		Map<String,Map<String,String>> m1= new HashMap<String,Map<String,String>>();
		Map<String,String> m2= new HashMap<String,String>();
		m2.put("ff", "asdf");
		m1.put("1", m2);
		System.out.println();
		Map m3 = m1.get("1");
		System.out.println(m2.get(m3.keySet().iterator().next()));
	}
}
