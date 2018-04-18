package com.zkw.nio.channelreadbuffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanToBuffer {
	private void ChannelToBuffer(){
		try {
			RandomAccessFile aFile = new RandomAccessFile("nio/com/zkw/nio/channelreadbuffer/nio-data.txt", "rw");
			FileChannel inChannel = aFile.getChannel();
			
			//create buffer with capacity of 48 bytes
			ByteBuffer byteBuffer = ByteBuffer.allocate(48);
			int bytesRead = inChannel.read(byteBuffer);//read into buffer.
			while(bytesRead != -1){
//				System.out.println("Read "+bytesRead);
				byteBuffer.flip();//make buffer ready for read
				
				while (byteBuffer.hasRemaining()) {
					System.out.print((char) byteBuffer.get());// read 1 byte at a time
				}
				byteBuffer.clear();//make buffer ready for writing
				bytesRead = inChannel.read(byteBuffer);
			}
			aFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ChanToBuffer test = new ChanToBuffer();
		test.ChannelToBuffer();
	}
}
