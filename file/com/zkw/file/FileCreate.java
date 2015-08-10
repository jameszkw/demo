package com.zkw.file;

import java.io.File;

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
	
	public static void main(String[] args) {
		try{
			FileCreate fc =new FileCreate();
			fc.creatDirectory();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
