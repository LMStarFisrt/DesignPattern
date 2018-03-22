package com.java.designpattrn.pattern.command.ex3;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public abstract class Command {

    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}