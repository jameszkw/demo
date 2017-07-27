package com.zkw.protobuf.pb;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/16 0016.
 * netty服务端
 */
@Component
public class PbServer implements ApplicationListener<ContextRefreshedEvent>,Ordered {

    private int port;

    public PbServer(int port){
        this.port = port;
    }

    public void run(int port){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ServerBootstrap b = new ServerBootstrap();
        b.group(bossGroup,workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new PbChannelInitialize())
                .option(ChannelOption.SO_BACKLOG,128)
                .childOption(ChannelOption.SO_KEEPALIVE,true);
        try {
            ChannelFuture future = b.bind(port).sync();
            future.channel().closeFuture().sync();
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 8999;
        new PbServer(port).run(port);
    }

    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        run(8999);
    }
}
