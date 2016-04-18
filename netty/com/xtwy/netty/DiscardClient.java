package com.xtwy.netty;

import com.xtwy.netty.codec.MyEncode;
import com.xtwy.netty.constants.CommonConstant;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class DiscardClient {

    public static Bootstrap b;
    public static PooledByteBufAllocator allocator = new PooledByteBufAllocator();

    static {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        b = new Bootstrap();
        b.group(workerGroup);
        b.channel(NioSocketChannel.class);
        b.option(ChannelOption.SO_KEEPALIVE,true);
        b.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel channel) throws Exception {
                channel.pipeline().addLast(new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()[0]));
                channel.pipeline().addLast(new StringDecoder());
                channel.pipeline().addLast(new MyEncode());
                channel.pipeline().addLast(new DiscardClientHandler());
            }
        });
    }

    public static Object startClient(int i) throws Exception{
        ChannelFuture future = b.connect("localhost",8999).sync();
        future.channel().writeAndFlush("hello server");
        future.channel().closeFuture().sync();
        return future.channel().attr(AttributeKey.valueOf(CommonConstant.ATTRIBUTE_KEY)).get();
    }


}
