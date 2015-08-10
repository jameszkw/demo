package com.zkw.traversal;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TraversalFiles {
	private static void travelFiles(){
		BlockingQueue<String> tQ = new LinkedBlockingQueue<String>();
//		File root = new File("/data/report_data/exportTxtJar");
		File root = new File("D:\\test\\task");
		 File[] files = root.listFiles();
		 for(File file:files){
			 tQ.add(file.toString());
		 }
		 for(String tName:tQ){
			 String str = tName.substring("D:\\test\\task".length()+1);
			 System.out.println("tQ:"+str.substring(0, str.lastIndexOf("txt")-1));
		 }
	}
	public static void main(String[] args) {
		travelFiles();
	}
}
