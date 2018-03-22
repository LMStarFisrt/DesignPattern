package com.java.designpattrn.pattern.command.ex1;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---客户要求增加一项需求---");
        AbstractGroup rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();

        System.out.println("---客户要求删除一项页面---");
        AbstractGroup pg = new PageGroup();
        pg.find();
        pg.delete();
        pg.plan();
    }

}
