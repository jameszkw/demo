package com.zkw.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map map = new TreeMap(/*new Comparator() {
			public int compare(Object o1, Object o2) {
				return 1;
			}
			
		}*/).descendingMap();
		
		map.put("1", "1");
		map.put("6", "6");
		map.put("2", "2");
		map.put("1", "1");
		map.put("8", "8");
		System.out.println(map);
			
	}
}
