package com.zkw.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-13 下午8:08:53
 *
 */
public class MapTest {
    private static void typeValueMap(){
        Map map = new HashMap();
        map.put("key1",2);
        map.put("key2","asdf");

        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
    }
	public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        int i = map.size()-1;

        Map<Integer, String> mapKey = new HashMap<Integer, String>();
        Map<Integer, String> mapValue = new HashMap<Integer, String>();
        
        for(java.util.Map.Entry<String, String> entry : map.entrySet()) {
        	//将原来MAP的VALUE放入新的MAP的VALUE里面
            mapKey.put(i, entry.getValue());
            //将原来MAP的KEY放入新的MAP的VALUE 里面
            mapValue.put(i, entry.getKey());
            i--;
        
         }
    //打印KEY值
         System.out.println(mapKey.get(2));
    //打印VALUE值
         System.out.println(mapValue.get(0));

        typeValueMap();
	}
}
