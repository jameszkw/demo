package com.zkw.string.stringTokenizer;

import java.util.StringTokenizer;

/**
 * @Description: test
 * @author James.zhang
 * @date 2014-5-7 下午1:40:28
 * 
 */
public class StringTokenizerTest {
	public static void trimTest(){
		String str = "";
//		str.trim();
		System.out.println("dd"+str+"dd");
	}

	public void test(){
		String buf = "traceroute to 9.9.9.9 (9.9.9.9), 30 hops max, 60 byte packets\n"+
				" 1  10.0.1.1  0.338 ms  *  0.311 ms\n"+
				" 2  124.207.192.113  2.165 ms *  2.798 ms\n"+
				" 3  10.255.38.81  1.751 ms  3.144 ms  3.899 ms\n"+
				" 4  10.255.59.5  2.943 ms  3.108 ms  3.318 ms\n"+
				" 5  124.205.97.173  1.813 ms  1.832 ms  1.806 ms\n"+
				" 6  218.241.165.169  2.485 ms  2.439 ms  2.460 ms\n"+
				" 7  202.99.1.213  2.254 ms  2.424 ms  2.556 ms\n"+
				" 8  * * *\n"+
				" 9  61.48.16.149  48.420 ms  48.771 ms  48.701 ms\n"+
				"10  61.148.157.41  52.331 ms  52.266 ms  52.100 ms\n"+
				"11   * 202.106.43.174  44.997 ms 202.106.43.66  55.239 ms\n"+
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
		buf = buf.replaceAll(" ms", "f");
		StringTokenizer st = new StringTokenizer(buf, "\n", false);
		int total = st.countTokens()-1;
		System.out.println("Token Total: " + total);
		String[] elements = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreElements()) {
			elements[i] = st.nextToken();
//			System.out.println(elements[i]);

			StringTokenizer stInner = new StringTokenizer(elements[i], " ", false);
			String[] elementsInner = new String[stInner.countTokens()];
			int j = 0;
			if(i >= 1){
				while(stInner.hasMoreElements()){
					elementsInner[j] = stInner.nextToken();
					System.out.println(j+"inner:"+elementsInner[j]);
					j++;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		trimTest();
		
	}
	
}
