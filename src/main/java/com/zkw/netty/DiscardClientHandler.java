package com.zkw.netty;

import com.zkw.netty.constants.CommonConstant;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class DiscardClientHandler extends ChannelHandlerAdapter {
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("client handler read: "+msg.toString());
        ctx.channel().attr(AttributeKey.valueOf(CommonConstant.ATTRIBUTE_KEY)).set(msg.toString());
        ctx.close();
    }

    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client handler active");
    }
}
