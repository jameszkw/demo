package com.zkw.binarySearch;

import gnu.trove.list.array.TIntArrayList;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-4 上午10:41:39
 *
 */
public class BinarySearch {
	
	private int binarySearch(int value,TIntArrayList list,int start,int end) {
		int low = start;
		int high = end;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = list.getQuick(mid);

			if (midVal < value) {
				low = mid + 1;
			} else if (midVal > value) {
				high = mid - 1;
			} else {
				return mid; // value found
			}
		}
		return high;
	}
	
	public static void main(String[] args) {
		TIntArrayList list = new TIntArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		int value = 2;
		BinarySearch b = new BinarySearch();
		System.out.println(b.binarySearch(value,list,0,list.size()-1));
		
//		int low = 0;
		int high = 11;
		int mid = (high) >>> 1;
		int mid2 = high/2;
		System.out.println(mid);
		System.out.println(mid2);
		
	}
}
