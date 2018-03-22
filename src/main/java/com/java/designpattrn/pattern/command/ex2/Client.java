package com.java.designpattrn.pattern.command.ex2;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        System.out.println("---客户要求增加一项需求---");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
        System.out.println("---客户要求删除一项页面---");
        Command deletCommand = new DeletePageCommand();
        invoker.setCommand(deletCommand);
        invoker.action();
    }

}
