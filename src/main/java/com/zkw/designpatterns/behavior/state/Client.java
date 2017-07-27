package com.zkw.designpatterns.behavior.state;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 下午 4:27
 **/

public class Client {
    public static void main(String[] args) {
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
