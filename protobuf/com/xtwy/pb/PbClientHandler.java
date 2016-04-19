package com.xtwy.pb;

import com.xtwy.netty.constants.CommonConstant;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2016/4/19 0019.
 */
public class PbClientHandler extends ChannelHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        UserProtobuf.User user = (UserProtobuf.User) msg;
        ctx.channel().attr(AttributeKey.valueOf(CommonConstant.ATTRIBUTE_KEY)).set(user);
        ctx.channel().close();
    }
}
