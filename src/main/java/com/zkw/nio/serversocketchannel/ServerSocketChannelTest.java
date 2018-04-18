package com.zkw.nio.serversocketchannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelTest {
	private void test(){
		try {
			ServerSocketChannel serverSocketChannel  = ServerSocketChannel.open();
			serverSocketChannel.socket().bind(new InetSocketAddress(9999));
			while(true){
				SocketChannel socketChannel = serverSocketChannel.accept();
				//do something with socketChannel...
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
	}
}
