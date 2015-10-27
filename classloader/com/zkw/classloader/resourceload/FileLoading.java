package com.zkw.classloader.resourceload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName: FileLoading
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月23日 上午11:49:54
 *
 */
public class FileLoading {
	
	private void first(){
		//first
				File f = new File("src/main/java/com/zkw/fileloadtemp/sys.properties");
				try {
					InputStream is = new FileInputStream(f);
					Properties p = new Properties();
					p.load(is);
					System.out.println(p.getProperty("first"));
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	private void second(){
		//second
				try {
//					InputStream is = this.getClass().getClassLoader().getResourceAsStream("sys.properties"); //方法1
//					InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream( "sys.properties"); //方法2
					InputStream is = ClassLoader.getSystemResourceAsStream("com/zkw/fileloadtemp/sys.properties"); //方法3
					Properties p = new Properties();
					p.load(is);
					System.out.println(p.getProperty("first"));
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	public static void main(String[] args) {
		FileLoading fileL = new FileLoading();
		fileL.second();
		fileL.first();
		
	}
}
