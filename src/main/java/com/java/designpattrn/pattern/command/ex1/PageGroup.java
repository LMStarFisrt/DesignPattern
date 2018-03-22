package com.java.designpattrn.pattern.command.ex1;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class PageGroup extends AbstractGroup {

    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户要求变更一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }

    @Override
    public void rollBack() {
        System.out.println("撤回页面变更");
    }
}
