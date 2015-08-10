package com.zkw.mapIterator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description: 迭代Map的两种方法（没有测试哪个快呢？）
 * @author James.zhang
 * @date 2014-5-13 下午8:23:02
 *
 */
public class MapIteratorTest {
	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String,String>();
		map.put("1", "one");
		map.put("2","two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		map.put("6", "six");
		for (Iterator<String> keys = map.keySet().iterator(); keys.hasNext();) {
			String key = (String) keys.next();
			String value=map.get(key);
			System.out.println("键"+key+"="+"值"+value);
		}
		for (Iterator<Map.Entry<String, String>> keys = map.entrySet().iterator(); keys.hasNext();) {
			Map.Entry<String, String> entry =(Map.Entry<String, String>)keys.next();
			String key=(String)entry.getKey();
			String value=(String)entry.getValue();
			System.out.println("第二种方法：键"+key+"="+"值"+value);
		}
	}
	
}
