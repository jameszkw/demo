package com.zkw.socketServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
	    Socket socket;  
	    PrintWriter out;
	    public SocketClient()   
	    {  
	        try   
	        {  
	            socket = new Socket("127.0.0.1", 10000);  
				//send
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				bw.write("dddddddd");
				bw.flush();
				bw.close();
//	            out = new PrintWriter(socket.getOutputStream(), true);  
//	            out.write("fffff");
//	            out.close();  
	              
	            socket.close();  
	              
	        } catch (IOException e) {  
	        }  
	    }  
	  
	    public static void main(String[] args)   
	    {  
	        new SocketClient();
	    }  
}
