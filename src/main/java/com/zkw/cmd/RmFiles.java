package com.zkw.cmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RmFiles {
	private void rmFiles(){
		String cmd = "rm -rf /root/zkw/rmtest/*";
		try {
			Process p = Runtime.getRuntime().exec(new String[] { "/bin/sh", "-c", cmd });
			BufferedInputStream in = new BufferedInputStream(p.getInputStream());
			BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
			String lineStr;
			while ((lineStr = inBr.readLine()) != null)
				System.out.println(lineStr);
			if (p.waitFor() != 0) {
				if (p.exitValue() == 1)// p.exitValue()==0表示正常结束，1：非正常结束
					System.err.println("remove files failed... ...");
			}
			inBr.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RmFiles rf = new RmFiles();
		rf.rmFiles();
	}
}
