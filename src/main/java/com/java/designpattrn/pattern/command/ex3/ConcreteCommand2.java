package com.java.designpattrn.pattern.command.ex3;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class ConcreteCommand2 extends Command {

    public ConcreteCommand2() {
        super(new ConcreteReciver2());
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
