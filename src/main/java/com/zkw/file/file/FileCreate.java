package com.zkw.file.file;

import java.io.File;
import java.io.IOException;

/**
 * @Description: TODO create directory
 * @author James.zhang
 * @date 2014-8-14 下午3:32:07
 *
 */
public class FileCreate {
	private static File file = new File("/home/jaems/db_monitor_main");
	
	private void creatDirectory(){
		try {
			if(!file.exists()){
				file.mkdir();
				System.out.println("created ... ...");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void directory(){
		File directory = new File("D:\\workspacesource\\TOMCAT_7_0_47/lib");
		try {
			directory = directory.getCanonicalFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try{
			FileCreate fc =new FileCreate();
			fc.creatDirectory();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
