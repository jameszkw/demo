package com.zkw.netty.newdemo;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.*;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.serialization.ClassResolvers;
import org.jboss.netty.handler.codec.serialization.ObjectDecoder;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Netty 服务端代码
 *
 * @blog http://www.coderli.com
 */
public class HelloServer {

    private static ChannelHandler[] getServerHandlers() {
        return new ChannelHandler[]{new ObjectDecoder(ClassResolvers.cacheDisabled(HelloServer.class.getClassLoader())), new ObjectServerHandler(), new HelloServerHandler()};
    }

    public static void main(String[] args) {
        // Server服务启动器
        ServerBootstrap bootstrap = new ServerBootstrap(
                new NioServerSocketChannelFactory(
                        Executors.newCachedThreadPool(),
                        Executors.newCachedThreadPool()));
        // 设置一个处理客户端消息和各种消息事件的类(Handler)
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {

            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline(getServerHandlers());
            }
        });
        // 开放8000端口供客户端访问。
        bootstrap.bind(new InetSocketAddress(8000));
    }

    private static class HelloServerHandler extends SimpleChannelHandler {
        /**
         * 当有客户端绑定到服务端的时候触发，打印"Hello world, I'm server."
         */
        @Override
        public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
            System.out.println("Hello world, I'm server.");
        }
    }
}
