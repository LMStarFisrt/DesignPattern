package com.java.designpattrn.pattern.command.ex1;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class CodeGroup extends AbstractGroup {

    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能");
    }

    @Override
    public void change() {
        System.out.println("客户要求变更一项功能");
    }

    @Override
    public void plan() {
        System.out.println("客户要求功能变更计划");
    }

    @Override
    public void rollBack() {
        System.out.println("撤回功能变更");
    }
}
