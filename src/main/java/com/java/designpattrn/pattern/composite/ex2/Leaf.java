package com.java.designpattrn.pattern.composite.ex2;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Leaf implements ILeaf {

    private String name = "";
    private String position = "";

    private int salary = 0;

    public Leaf(String name, String position, int salary) {
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
}
