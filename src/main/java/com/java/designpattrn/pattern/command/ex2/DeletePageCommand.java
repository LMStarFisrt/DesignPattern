package com.java.designpattrn.pattern.command.ex2;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
