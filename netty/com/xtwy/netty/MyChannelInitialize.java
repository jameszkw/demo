package com.xtwy.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class MyChannelInitialize extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new DiscardServerHandler());
    }
}
