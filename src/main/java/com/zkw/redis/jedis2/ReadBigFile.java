package com.zkw.redis.jedis2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: ReadBigFile
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月14日 下午11:08:57
 *
 */
public class ReadBigFile {
	public void ReadFile(String filename) {
		File file = new File(filename);
		BufferedReader reader = null;
		try {
//			reader = new BufferedReader(new FileReader(file)); // 如果是读大文件 则 new
																// BufferedReader(new
																// FileReader(file),5*1024*1024);
																// 即，设置缓存
			reader = new BufferedReader(new FileReader(file),5*1024*1024);
			String tempString = null;
			while ((tempString = reader.readLine()) != null)
			{
				// 进行操作.....
				System.out.println(tempString);
				String[] line = tempString.split(",");
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null)
			{
				try {
					reader.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ReadBigFile file = new ReadBigFile();
		file.ReadFile("E://work//借贷宝//mission//putfriend2redis//renmaiData//0928noIdentityUsers.csv ");
	}
}
