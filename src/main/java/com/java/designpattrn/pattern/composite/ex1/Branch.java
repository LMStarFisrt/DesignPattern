package com.java.designpattrn.pattern.composite.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10308
 * @date 2018/4/12
 */
public class Branch implements IBranch {

    private List subordinateList = new ArrayList();

    private String name = "";
    private String position = "";

    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder = builder.append("名称：").append(name)
                .append("\t职位：").append(position)
                .append("\t薪水：").append(salary);
        return builder.toString();
    }

    @Override
    public void add(IBranch branch) {
        subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        subordinateList.add(leaf);
    }

    @Override
    public List getSubordonateInfo() {
        return subordinateList;
    }
}
