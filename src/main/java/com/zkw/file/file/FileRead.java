package com.zkw.file.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
	private void read(){
		try {
		
		String fileContent = "";
        //目标地址
File file = new File("");
if (file.isFile() && file.exists()) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		
		String line;
                                //循环，每次读一行
			while ((line = reader.readLine()) != null) {
				fileContent += line;
			}
			reader.close();
		} 
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {

	}
}
