package com.java.designpattrn.pattern.command.ex3;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
