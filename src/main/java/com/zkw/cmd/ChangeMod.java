package com.zkw.cmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeMod {
	public static void main(String[] args) {
		// windows
		// String cmd = "F:\\apache-tomcat-6.0.20.exe";
		// String cmd =
		// "D:\\Program Files\\Microsoft Office\\OFFICE11\\WINWORD.EXE F:\\test.doc";
		// String cmd = "cmd.exe /c start F:\\test.doc";
		// String cmd = "ping www.baidu.com";

		// linux
		// String cmd = "./fork_wait";
		// String cmd = "ls -l";
		// String[] cmd=new String[3];
		// cmd[0]="/bin/sh";
		// cmd[1]="-c";
		// cmd[2]="ls -l ./";

		String cmd = "chmod 777 /root/zkw/jdbc.properties";
		Runtime run = Runtime.getRuntime();
		try {
			Process p = run.exec(cmd);
			BufferedInputStream in = new BufferedInputStream(p.getInputStream());
			BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
			String lineStr;
			while ((lineStr = inBr.readLine()) != null)
				System.out.println(lineStr);
			if (p.waitFor() != 0) {
				if (p.exitValue() == 1)// p.exitValue()==0表示正常结束，1：非正常结束
					System.err.println("change mode failed... ...");
			}
			inBr.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
