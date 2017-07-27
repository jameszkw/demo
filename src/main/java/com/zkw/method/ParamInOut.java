package com.zkw.method;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ParamInOut
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年9月20日 下午6:25:06
 *
 */
public class ParamInOut {
	private void in(Integer i){
		i = 3;
		System.out.println(i);
	}
	private void vm(Map map){
		map.put("test", "fffff");
		System.out.println(map);
	}
	public static void main(String[] args) {
		ParamInOut paramInOut = new ParamInOut();
		Integer I = 5;
		paramInOut.in(I);
		System.out.println(I);
		Map map = new HashMap();
		paramInOut.vm(map);
		System.out.println(map);
		
		
	}
}
