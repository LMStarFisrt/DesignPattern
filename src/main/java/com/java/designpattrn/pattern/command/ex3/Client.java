package com.java.designpattrn.pattern.command.ex3;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand1();
        invoker.setCommand(command);
        invoker.action();
    }
}
