package com.zkw.trove.TArrayList;

import gnu.trove.list.array.TIntArrayList;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-9 下午7:47:46
 *
 */
public class TIntArrayListTest {
	private void test(){
		TIntArrayList valueColors = new TIntArrayList();
		valueColors.add(1);
		valueColors.add(1);
		valueColors.add(1);
		valueColors.add(0);
		int rtn=0;
		int first=-1;
		boolean nodifferent=true;
		boolean hasZero=false;
		for(int i=0;i<valueColors.size();i++){
			int v=valueColors.getQuick(i);
			if(first==-1){
				first=v;
			}else{
				if(v!=first){
					nodifferent=false;
				}
			}
			if(v==0){
				hasZero=true;
			}
		}
		if(hasZero){
			rtn=0;
		}else{
			if(nodifferent){
				rtn=first;
			}else{
				rtn=1;
			}
		}
		System.out.println(rtn);
	}
	public static void main(String[] args) {
		TIntArrayListTest tIntArrayListTest = new TIntArrayListTest();
		tIntArrayListTest.test();
	}
}
