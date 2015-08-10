package com.zkw.list;

import java.util.ArrayList;
import java.util.List;


public class InitCapacity {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>(1);
	        list.add(1);
	        list.add(2);
	        for(int i=0;i<list.size();i++){
	        	System.out.println(list.get(i));
	        }
	        
	}
}
