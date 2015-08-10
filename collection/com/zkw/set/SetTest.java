package com.zkw.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-9 上午10:29:05
 *
 */
public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("4");
		Iterator iterator = set.iterator();
		System.out.println(set.size());
		while(iterator.hasNext()){
			System.out.println(iterator.next());

		}
	}
}
