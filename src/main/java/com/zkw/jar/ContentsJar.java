package com.zkw.jar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

public class ContentsJar {
	private void contents() {
		try {
			String[] commandList = {
					"jar",
					"tvf",
					"D:/workplaceApmAgent/Smart_Agent/SmartAgent/src/TomcatAgent/target/cloudwise-tomcat-0.1.jar" };
			ProcessBuilder processBuilder = new ProcessBuilder(commandList);
			Process process = processBuilder.start();
			InputStream stream = process.getInputStream();
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader br = new BufferedReader(reader);
			OutputStream output = new FileOutputStream(
					"D:\\test\\output-text.txt");
			OutputStreamWriter ow =  new OutputStreamWriter(output);
			BufferedWriter bw = new BufferedWriter(ow);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line+"\n");
			}
			reader.close();
			output.close();
			bw.close();

			// FileOutputStream fop = new FileOutputStream();
			// stream.flush();
			// stream.close();

			// FileOutputStream fop = new FileOutputStream(new
			// File("D:/newfile.txt"));
			// BufferedOutputStream bs = new BufferedOutputStream(fop);
			// bs.flush();
			// bs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void read() {
		try {
			String[] commandList = {
					"jar",
					"tvf",
					"D:/workplaceApmAgent/Smart_Agent/SmartAgent/src/TomcatAgent/target/cloudwise-tomcat-0.1.jar" };

			ProcessBuilder builder = new ProcessBuilder(commandList);
			Map<String, String> environ = builder.environment();

			Process process;
			process = builder.start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Program terminated!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ContentsJar cj = new ContentsJar();
		// cj.read();
		cj.contents();
	}
}
