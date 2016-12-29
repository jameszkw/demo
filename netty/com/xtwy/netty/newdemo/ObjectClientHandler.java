package com.xtwy.netty.newdemo;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class ObjectClientHandler extends SimpleChannelHandler {
    /**
     * 当绑定到服务端的时候触发，给服务端发消息。
     */
    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        // 向服务端发送Object信息
        System.out.println("Hello world, I'm client.");
        sendObject(e.getChannel());
    }

    private void sendObject(Channel channel) {
        Command command =new Command();
        command.setActionName("Hello action.");
        channel.write(command);
    }
}
