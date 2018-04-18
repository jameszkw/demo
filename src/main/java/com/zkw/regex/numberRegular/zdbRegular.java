package com.zkw.regex.numberRegular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class zdbRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = " 9  61.48.16.149  48.420 ms  48.771 ms  48.701 ms";
		str = str.replaceAll("ms", "").replaceAll("[ ]+", "#");
		System.out.println(str);
	    String regEx = "^#[\\d]+#([\\d|\\.]+)#([\\d|\\.]+)#([\\d|\\.]+)#([\\d|\\.]+)#$";  
	    Pattern pat = Pattern.compile(regEx);  
	    Matcher mat = pat.matcher(str);  
	    if(mat.matches()){
	    	//mat.find()
	    	System.out.println("ip:" + mat.group(1) );
	   	    System.out.println("1:" + mat.group(2) );
	   	    System.out.println("2:" + mat.group(3) );
	   	    System.out.println("3:" + mat.group(4) );
	    }else{
	    	System.out.println("取出来的不能匹配");
	    }

	}

}
