package com.zkw.nio.datagramchannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannelTest {
	private void receiveTest(){
		try {
			DatagramChannel datagramChannel = DatagramChannel.open();
			datagramChannel.socket().bind(new InetSocketAddress(9999));
			
			ByteBuffer buf = ByteBuffer.allocate(48);
			buf.clear();
			datagramChannel.receive(buf);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void sendTest(){
		String newData = "test";
		ByteBuffer buf = ByteBuffer.allocate(48);
		buf.clear();
		buf.put(newData.getBytes());
		buf.flip();
	}
	public static void main(String[] args) {
		
	}
}
