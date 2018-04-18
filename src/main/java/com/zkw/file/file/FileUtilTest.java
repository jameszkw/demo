package com.zkw.file.file;

import java.io.*;

import org.apache.commons.io.FileUtils;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-9-5 上午10:45:40
 *
 */
public class FileUtilTest {
	private static void zip2file(){
		try {
			FileInputStream fis = new FileInputStream("D://bill.zip");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int c = 0;
			byte [] buf = new byte[1024];
			while((c=fis.read(buf)) != -1){
				bos.write(buf, 0, c);
			}
			buf = bos.toByteArray();
			FileOutputStream fos = new FileOutputStream("out.zip");
			fos.write(buf);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void byte2file(){
		try{
//			String alertConfig = FileUtils.readFileToString(new File("src/main/java/com/zkw/file/file/FileUtilTest.txt"));
//			System.out.println(alertConfig);
			FileUtils.writeByteArrayToFile(new File("D://test.csv"),"string,123".getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		zip2file();

	}
}
