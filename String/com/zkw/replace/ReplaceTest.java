package com.zkw.replace;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author James.zhang
 * @date 2014-5-28 上午10:55:13
 *
 */
public class ReplaceTest {
	public static void main(String[] args) {
		String backMes = "\n大\r小\t中\r123\0aaj\0\0\0";
		String backMes2 ="<LF>大<CR>小<TAB>中<CR>123<NUL>aaj<NUL><NUL><NUL>";
		
		backMes = backMes.replace("\r","<CR>").replace("\n", "<LF>").replace("\t", "<TAB>").replace("\0", "<NUL>");
		backMes2 = backMes2.replace("<CR>","\r").replace("<LF>", "\n").replace("<TAB>", "\t").replace("<NUL>", "\0");
		System.out.println(backMes);
		System.out.println(backMes2);
	}
}
