package com.zkw.string.indexof;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-21 上午9:36:48
 *
 */
public class IndexofTest {
	public static void main(String[] args) {
		String buf = "traceroute to 9.9.9.9 (9.9.9.9), 30 hops max, 60 byte packets\n"+
				" 1  10.0.1.1  0.338 ms  0.384 ms  0.311 ms\n"+
				" 2  124.207.192.113  2.165 ms *  2.798 ms\n"+
				" 3  10.255.38.81  1.751 ms  3.144 ms  3.899 ms\n"+
				" 4  10.255.59.5  2.943 ms  3.108 ms  3.318 ms\n"+
				" 5  124.205.97.173  1.813 ms  1.832 ms  1.806 ms\n"+
				" 6  218.241.165.169  2.485 ms  2.439 ms  2.460 ms\n"+
				" 7  202.99.1.213  2.254 ms  2.424 ms  2.556 ms\n"+
				" 8  * * *\n"+
				" 9  61.48.16.149  48.420 ms  48.771 ms  48.701 ms\n"+
				"10  61.148.157.41  52.331 ms  52.266 ms  52.100 ms\n"+
				"11  * * *\n"+
				"12  * * *\n"+
				"13  * * *\n"+
				"14  * * *\n"+
				"15  * * *\n"+
				"16  * * *\n"+
				"17  * * *\n"+
				"18  * * *\n"+
				"19  * * *\n"+
				"20  * * *\n"+
				"21  * * *\n"+
				"22  * * *\n"+
				"23  * * *\n"+
				"24  * * *\n"+
				"25  * * *\n"+
				"26  * * *\n"+
				"27  * * *\n"+
				"28  * * *\n"+
				"29  * * *\n"+
				"30  * * *";
		System.out.println(buf);
//		System.out.println(buf.indexOf("received,"));
		
		String resultStr = buf.toString().trim();
//        int beg = resultStr.indexOf("received,");
//        int end = resultStr.indexOf("packet",beg+9);
//        String lostRate = resultStr.substring(beg+10, end);
//        String averageTime = resultStr.substring( resultStr.lastIndexOf(" ")+1);
//        
//        System.out.println(lostRate);
//        System.out.println(averageTime);
        
        
	}
}
