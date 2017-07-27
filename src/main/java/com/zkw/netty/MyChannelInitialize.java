package com.zkw.netty;

import com.zkw.netty.codec.MyEncode;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class MyChannelInitialize extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()[0]));
        channel.pipeline().addLast(new StringDecoder());

        channel.pipeline().addLast(new MyEncode());
        channel.pipeline().addLast(new DiscardServerHandler());
    }
}
