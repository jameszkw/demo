package com.zkw.list;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-22 下午4:36:10
 *
 */
public class ArrayTransList {
	public static void main(String[] args) {
		String monitors = "1,2,,3"; 
		String[] monitArray = monitors.split(",");
		System.out.println(monitArray);
		List<String> monitList = Arrays.asList(monitArray);
		System.out.println(monitList.remove(null));
		System.out.println(monitList);
		
	}
}
