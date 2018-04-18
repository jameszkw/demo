package com.zkw.multithreadserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/5/26 0026.
 */
public class SingleThreadedServer implements Runnable {
    protected int serverPotr=8080;
    protected ServerSocket serverSocket=null;
    protected boolean isStopped=false;
    protected Thread runningThread=null;

    public SingleThreadedServer(int serverPotr) {
        this.serverPotr = serverPotr;
    }

    public void run() {
//        synchronized (this){
//            this.runningThread=Thread.currentThread();
//        }
        openServerSocket();
        while (!isStopped){
            System.out.println("accepting ... ...");
            Socket clientSocket=null;
            try {
                clientSocket=this.serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
                if(isStopped()) {
                    System.out.println("Server Stopped.") ;
                    return;
                }
            }

            try {
                processClientRequest(clientSocket);
            } catch (IOException e) {
                //log exception and go on to next request.
            }
        }
    }

    private void openServerSocket(){
        try {
            this.serverSocket=new ServerSocket(this.serverPotr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized boolean isStopped() {
        return this.isStopped;
    }

    private void processClientRequest(Socket clientSocket)
            throws IOException {
        InputStream input  = clientSocket.getInputStream();
        OutputStream output = clientSocket.getOutputStream();
        long time = System.currentTimeMillis();
        output.write(("HTTP/1.1 200 OK\n\n<html><body>" +
                "Singlethreaded Server: " +
                time +
                "</body></html>").getBytes());
        output.flush();
        output.close();
        input.close();
        System.out.println("Request processed: " + time);
    }

    public synchronized void stop(){
        this.isStopped = true;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException("Error closing server", e);
        }
    }



}
