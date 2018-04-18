package com.zkw.date.frequence;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-26 下午2:40:50
 *
 */
public class PeriodTime {
	public static void main(String[] args) {
		long cur = System.currentTimeMillis();
		long begin =  cur-3600000;
//		System.out.println("begin:"+begin);
//		System.out.println("cur  :"+cur);
		long frequency = 5;
		long create = 1400902715000L;
		// && create+frequency*i<=cur
		long i = 0;
//		begin<=create+frequency*i;
//		i = (begin-create)/frequency;
//		
//		System.out.println("asdf:"+i);
//				
//		if(begin<=create+frequency*i){
//			i++;
//			System.out.println(i);
//			
//		}
		for(int n = 0;n*frequency+create<=cur;n++){
			System.out.println("for");
			System.out.println(n);
			
		}
		
	}
}
