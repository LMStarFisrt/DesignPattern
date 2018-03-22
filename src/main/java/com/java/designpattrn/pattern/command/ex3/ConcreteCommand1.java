package com.java.designpattrn.pattern.command.ex3;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class ConcreteCommand1 extends Command {

    public ConcreteCommand1() {
        super(new ConcreteReciver1());
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
