package com.xtwy.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by Administrator on 2016/4/16 0016.
 */
public class DiscardServerHandler extends ChannelHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        		ByteBuf buf = (ByteBuf)msg;
		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		String body = new String(req,"UTF-8");
		int s = 0;
		 while (buf.isReadable()) { // (1)
			     s = buf.readInt();
	             System.out.println(s);
	        }

       /* System.out.println(msg);
        //处理业务代码
        String result = "I have recieve "+msg;
        ctx.writeAndFlush(result);*/
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
