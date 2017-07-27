package com.zkw.regex.regular.extracter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: 提取函数
 * @author James.zhang
 * @date 2014-5-20 下午7:44:28
 *
 */
public class Extracter {
	public static void main(String[] args) {
//		String regEx="\\$\\{\\w+\\((\\w+\\,*)*\\)\\}";
//		String regEx=".*\\$\\{(.*)\\}.*\\$\\{(.*)\\}.*\\$\\{(.*)\\}.*";
		String regEx=".*\\$\\{(.*)\\}.*";
		String str="sdf${timestamp(s,string1)}1233//41${timestamp(string1)}23${timestamp(string2)}4";//
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		boolean rs=m.find();
		System.out.println(rs);
		
		
		for(int i=1;i<=m.groupCount();i++){
		System.out.println(m.group(i));
		}
	}
}
