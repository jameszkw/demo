package com.zkw.designpatterns.behavior.command;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 上午 11:21
 **/

public class ConcreteCommand extends Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute() {
        this.receiver.doSomething();
    }
}
