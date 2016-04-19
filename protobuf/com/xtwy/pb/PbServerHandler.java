package com.xtwy.pb;

import com.google.protobuf.ByteString;
import com.xtwy.media.Media;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class PbServerHandler extends ChannelHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        RequestMsgProtobuf.RequestMsg requestMsg = (RequestMsgProtobuf.RequestMsg)msg;
        String cmd = requestMsg.getCmd();
        System.out.println("cmd:"+cmd);

//        ByteString buf = requestMsg.getRequestParam();
//
//        UserProtobuf.User user = UserProtobuf.User.parseFrom(buf);
//        System.out.println(user.getUsername());
        Object response = Media.execute(requestMsg);
        ctx.writeAndFlush(response);

    }
}