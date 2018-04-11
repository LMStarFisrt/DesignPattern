package com.java.designpattrn.pattern.iterator.ex1;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class Project implements IProject {

    private String name;

    private int num;

    private int cost;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        StringBuilder builder = new StringBuilder();
        builder = builder.append("项目名称是：").append(this.name);
        builder = builder.append("\t项目人数：").append(this.num);
        builder = builder.append("\t项目费用：").append(this.cost);
        return builder.toString();
    }
}
