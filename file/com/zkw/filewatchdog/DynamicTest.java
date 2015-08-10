package com.zkw.filewatchdog;

import java.io.File;

public class DynamicTest {
	private void changeFile(){
		File file = new File("file/com/zkw/filewatchdog/log4j.xml");
		System.out.println(file.exists());
		Log4jInitializer.configureAndWatch("file/com/zkw/filewatchdog/log4j.xml", 30000L);
	}
	public static void main(String[] args) {
		DynamicTest test = new DynamicTest();
		test.changeFile();
	}
}
