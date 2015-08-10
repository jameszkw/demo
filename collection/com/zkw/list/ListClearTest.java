package com.zkw.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-13 下午12:23:09
 *
 */
public class ListClearTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		list.clear();
		System.out.println(list.get(0));
		list = null;
		System.out.println(list.get(0));
		
	}
}
