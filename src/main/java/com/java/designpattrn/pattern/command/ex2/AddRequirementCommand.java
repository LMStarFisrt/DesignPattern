package com.java.designpattrn.pattern.command.ex2;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.pg.add();
        super.cg.add();
        super.rg.plan();
    }
}
