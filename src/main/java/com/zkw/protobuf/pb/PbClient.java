package com.zkw.protobuf.pb;

import com.zkw.netty.constants.CommonConstant;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class PbClient {

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
                channel.pipeline().addLast(new ProtobufVarint32FrameDecoder());
                channel.pipeline().addLast(new ProtobufDecoder(UserProtobuf.User.getDefaultInstance()));
                channel.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
                channel.pipeline().addLast(new ProtobufEncoder());
                channel.pipeline().addLast(new PbClientHandler());
            }
        });
    }

    public static Object startClient(RequestMsgProtobuf.RequestMsg.Builder obj) throws Exception{
        ChannelFuture future = b.connect("localhost",8999).sync();
        future.channel().writeAndFlush(obj);
        future.channel().closeFuture().sync();
        return future.channel().attr(AttributeKey.valueOf(CommonConstant.ATTRIBUTE_KEY)).get();
    }


}
