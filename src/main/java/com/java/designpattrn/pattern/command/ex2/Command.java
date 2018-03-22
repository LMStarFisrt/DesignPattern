package com.java.designpattrn.pattern.command.ex2;

import com.java.designpattrn.pattern.command.ex1.CodeGroup;
import com.java.designpattrn.pattern.command.ex1.PageGroup;
import com.java.designpattrn.pattern.command.ex1.RequirementGroup;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
