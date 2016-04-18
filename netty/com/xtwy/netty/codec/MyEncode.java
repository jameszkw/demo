package com.xtwy.netty.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageCodec;
import io.netty.handler.codec.Delimiters;

import java.util.List;

/**
 * Created by Administrator on 2016/4/18 0018
 */
public class MyEncode extends ByteToMessageCodec<String> {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

    }

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, String s, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(s.getBytes("utf-8"));
        byteBuf.writeBytes(Delimiters.lineDelimiter()[0]);
    }
}
