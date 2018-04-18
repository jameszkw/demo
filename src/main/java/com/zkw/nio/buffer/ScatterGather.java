package com.zkw.nio.buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ScatterGather {
	private void scatter(){
		try {
			ByteBuffer header = ByteBuffer.allocate(128);
			ByteBuffer body = ByteBuffer.allocate(1024);
			
			ByteBuffer[] bufferArray = {header,body};
			RandomAccessFile aFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel inChannel = aFile.getChannel();
			inChannel.read(bufferArray);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
