package com.zkw.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-7-15 下午2:28:28
 *
 */
public class MapKeyTest {
	private void judgeNull(){
		Map<String,String> map = new HashMap<String,String>();
		if(map.get("ids").isEmpty()||map.get("ids") == null){
			System.out.println("null");
		}
	}
	public static void main(String[] args) {
		 MapKeyTest mt =  new MapKeyTest();
		 mt.judgeNull();
	}
}
