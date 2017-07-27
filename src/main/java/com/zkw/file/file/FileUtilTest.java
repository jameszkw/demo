package com.zkw.file.file;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-5 上午10:45:40
 *
 */
public class FileUtilTest {
	public static void main(String[] args) {
		try{
			String alertConfig = FileUtils.readFileToString(new File("file/com/zkw/file/FileUtilTest.txt"));
			System.out.println();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
