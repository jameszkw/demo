package com.zkw.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCircle {
	private void circle(){
		List<Map<String,Object>> li = new ArrayList<Map<String,Object>>();
		
		for(int i=0;i<2;i++){
			Map<String,Object> m = new HashMap<String,Object>();
			for(int j=0;j<1;j++){
				m.put("1", j);
				li.add(m);
			}
		}
		System.out.println(li);
	}
	public static void main(String[] args) {
		MapCircle c = new MapCircle();
		c.circle();
	}
}
