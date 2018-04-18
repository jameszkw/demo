package com.zkw.nio.channeltransfer;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class ChannelTransfer {
	private void from(){
		try {
			RandomAccessFile fromFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel fromChannel = fromFile.getChannel();
			
			RandomAccessFile toFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel toChannel = toFile.getChannel();
			
			long position = 0;
			long count = fromChannel.size();
			toChannel.transferFrom(fromChannel, position, count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void to(){
		try {
			RandomAccessFile fromFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel fromChannel = fromFile.getChannel();
			
			RandomAccessFile toFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel toChannel = toFile.getChannel();
			
			long position = 0;
			long count = fromChannel.size();
			
			fromChannel.transferTo(position, count, toChannel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
