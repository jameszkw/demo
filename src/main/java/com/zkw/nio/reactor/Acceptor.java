package com.zkw.nio.reactor;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2018-02-26 下午 5:29
 **/

public class Acceptor implements Runnable{
    private Reactor reactor;
    public Acceptor(Reactor reactor){
        this.reactor=reactor;
    }

    public void run() {
        try {
            SocketChannel socketChannel=reactor.serverSocketChannel.accept();
            if(socketChannel!=null)//调用Handler来处理channel
                new SocketReadHandler(reactor.selector, socketChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
