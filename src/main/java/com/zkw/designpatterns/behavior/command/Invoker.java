package com.zkw.designpatterns.behavior.command;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-06-28 上午 11:20
 **/

public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
