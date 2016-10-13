package com.zkw.set;

import org.springframework.core.env.PropertySource;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-9 上午10:29:05
 *
 */
public class SetTest {

	private Object interatorTest(String name){
		Set<PropertySource<?>> propertySources = new LinkedHashSet();
		Iterator var2 = propertySources.iterator();
		Object candidate = null;

		while (var2.hasNext()){
			PropertySource propertySource = (PropertySource)var2.next();
			candidate = propertySource.getProperty(name);
			if (candidate != null){
				break;
			}
		}

		return candidate;
	}

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
