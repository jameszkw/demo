package com.zkw.socket.socket_backlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-12-28 下午 12:44
 **/

public class Test_backlog_client {
    public static void main(String[] args) {
        try {
            for (int i=0;i<2;i++){
                Socket socket=new Socket("127.0.0.1",10000);
                PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
                BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out.print("test");
                out.flush();
                System.out.println("客户端收到返回："+in.readLine());
                out.close();
                in.close();
                socket.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
