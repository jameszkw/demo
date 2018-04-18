package com.zkw.system.property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class SystemPropertyTest {
	private void LoadFileToSysProperty(){
		try {
			File file = new File("system/com/zkw/system/property/property.txt");
			FileInputStream fileStr = new FileInputStream("system/com/zkw/system/property/property.txt");
			Properties pro = new Properties(System.getProperties());
			pro.load(fileStr);
			System.setProperties(pro);
			System.getProperties().list(System.out);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SystemPropertyTest test = new SystemPropertyTest();
		test.LoadFileToSysProperty();
	}
}
