package com.zkw.regex.detectomcat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectorUtils {

	private static final Pattern SERVER_INFO_PATTERN = Pattern.compile("^\\s*([^/]+)\\s*/\\s*([\\d\\.]+(-RC\\d+)?)",Pattern.CASE_INSENSITIVE);
	 public static String getServerInfo(String serverInfo) {
		 Matcher matcher = SERVER_INFO_PATTERN.matcher(serverInfo);
		 if (matcher.matches()) {
	            String product = matcher.group(1);
	            String version = matcher.group(2);
	            // TODO: Extract access URL
	            if (product.toLowerCase().contains("tomcat")) {
	                return "Apache"+"tomcat"+version;
	            }
	        }
	        return null;
	    }

	 public static void main(String[] args) {
		System.out.println(DetectorUtils.getServerInfo("tomcat"));
	}
}
