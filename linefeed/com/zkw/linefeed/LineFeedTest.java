package com.zkw.linefeed;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-15 下午2:59:09
 *
 */
public class LineFeedTest {
	public static void main(String[] args) {
		System.out.print("回车开始" +"回车结束\n");
		System.out.print("回车开始" + "回车结束\t");
		System.out.print("t开始" + "回车结束\r");
		System.out.print("r开始" + "回车结束\r\n");
		System.out.print("rn开始" + "回车结束");
	}
}
