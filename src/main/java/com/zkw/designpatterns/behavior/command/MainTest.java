package com.zkw.designpatterns.behavior.command;

/**
 * 命令模式
 *
 * @author James
 * @create 2017-06-28 上午 11:31
 **/

public class MainTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        //客户端直接执行具体命令方式（此方式与类图相符）
        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
