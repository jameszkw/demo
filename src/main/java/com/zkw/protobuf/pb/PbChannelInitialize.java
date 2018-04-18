package com.zkw.protobuf.pb;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class PbChannelInitialize extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new ProtobufVarint32FrameDecoder());
        channel.pipeline().addLast(new ProtobufDecoder(RequestMsgProtobuf.RequestMsg.getDefaultInstance()));
        channel.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
        channel.pipeline().addLast(new ProtobufEncoder());
        channel.pipeline().addLast(new PbServerHandler());
    }
}
