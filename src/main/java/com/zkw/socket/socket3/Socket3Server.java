package com.zkw.socket.socket3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-11-28 下午 8:21
 **/

public class Socket3Server {
    private static int port=12345;

    public static void main(String[] args) {
        System.out.println("服务器启动...\n");
        Socket3Server server = new Socket3Server();
        server.init();
    }

    private void init(){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                // 一旦有堵塞, 则表示服务器与客户端获得了连接
                Socket client = serverSocket.accept();
                new HandlerThread(client);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private class HandlerThread implements Runnable{
        private Socket socket;
        public HandlerThread(Socket client) {
            socket = client;
            new Thread(this).start();
        }

        public void run() {
            InputStream in=null;
            OutputStream out = null;
            try {
                in=socket.getInputStream();
                String line = null;
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                while ((line = br.readLine()) != null){
                    System.out.println("接收到的数据："+line);
                }

                //获取输出流,给客户端响应消息
                out = socket.getOutputStream();
                out.write("服务端已处理数据".getBytes("UTF-8"));
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
