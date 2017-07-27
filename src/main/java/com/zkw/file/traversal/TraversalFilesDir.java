package com.zkw.file.traversal;

import java.io.File;
import java.util.ArrayList;

public class TraversalFilesDir {
 private static ArrayList<String> filelist = new ArrayList<String>();
 /*
  * 通过递归得到某一路径下所有的目录及其文件
  */
 static void getFiles(String filePath){
	 File root = new File(filePath);
	 File[] files = root.listFiles();
	 for(File file:files){
		 if(file.isDirectory()){
			 getFiles(file.getAbsolutePath());
			 filelist.add(file.getAbsolutePath());
			 System.out.println("显示"+filePath+"下所有子目录及其文件"+file.getAbsolutePath());
		 }else{
			 System.out.println("显示"+filePath+"下所有子目录"+file.getAbsolutePath());
		 }
	 }
 }
 
 public static void main(String[] args) throws Exception {
   
//    String filePath = "/home/jaems/rm";
    String filePath = "D:\\test\\task";
    getFiles(filePath);
 }
}
