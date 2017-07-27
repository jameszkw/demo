package com.zkw.regex.regular.extractergroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtracterGroup {
	private void common(){
		String text = "<textarea rows=\"20\" cols=\"70\">nexus maven repository index properties updating index central</textarea>";
        String reg = "<textarea.*?>.*?</textarea>";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
	}
	
	private void extracterGroup(){
		String text = "<textarea rows=\"20\" cols=\"70\">nexus maven repository index properties updating index central</textarea></textarea>";
        //下面的正则表达式中共有四个捕获组：(<textarea.*?>)、(.*?)、(</textarea>)和整个匹配到的内容
        String reg = "(<textarea.*?>)(?:.*?)(</textarea>)";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group(0)); // 整个匹配到的内容
            System.out.println(m.group(1)); // (<textarea.*?>)
            System.out.println(m.group(2)); // (.*?)
//            System.out.println(m.group(3)); // (</textarea>)
        }
	}
	
	public static void main(String[] args) {
		ExtracterGroup eg = new ExtracterGroup();
		eg.extracterGroup();
	}
}
