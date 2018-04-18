package com.zkw.socket.socket1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lifeng
 * 2017/11/28 14:14
 */
public class IOServer {

    /** 异常自行处理*/
    public void initServer(int port){
        try {
            //服务端socket
            final ServerSocket serverSocket =new ServerSocket(port);
            while(true){
                //阻塞等待客户端连接到来
                final Socket socket = serverSocket.accept();
                System.out.println("有客户端链接上来了。。。");
                new Thread(new Runnable() {
                    public void run() {
                        InputStream in = null;
                        OutputStream out = null;
                        try {
                            //获取输入流，读取客户信息
                            in = socket.getInputStream();
                            //定义缓存区
                            byte[] buf = new byte[1024];
                            String line = null;
                            StringBuffer sb = new StringBuffer();
                            BufferedReader br = new BufferedReader(new InputStreamReader(in));
                            while((line = br.readLine()) !=null){
                                System.out.println("接收到的数据："+line);
                                if(line.equals("exit")){
                                    break;
                                }
                                sb.append(line);
                            }
                            System.out.println("收到客户端:"+sb.toString());
                            //获取输出流,给客户端响应消息
                            out = socket.getOutputStream();
                            out.write("服务端已处理数据".getBytes("UTF-8"));
                            out.flush();
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            try {
                                out.close();
                                in.close();
                                socket.close();
                                serverSocket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IOServer ioServer = new IOServer();
        System.out.println("已启动服务端口:"+12345);
        ioServer.initServer(12345);
    }
}
