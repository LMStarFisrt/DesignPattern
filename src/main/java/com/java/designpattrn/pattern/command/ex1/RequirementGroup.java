package com.java.designpattrn.pattern.command.ex1;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class RequirementGroup extends AbstractGroup {

    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求");
    }

    @Override
    public void change() {
        System.out.println("客户要求变更一项需求");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划");
    }

    @Override
    public void rollBack() {
        System.out.println("撤回需求变更");
    }
}
