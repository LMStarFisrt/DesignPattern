package com.java.designpattrn.pattern.iterator.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class Project implements IProject {

    private List<IProject> projectList = new ArrayList<>();

    private String name;

    private int num;

    private int cost;

    public Project() {
    }

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder sb = new StringBuilder();
        sb = sb.append("项目名称是：").append(this.name)
                .append("\t项目人数：").append(this.num)
                .append("\t项目费用：").append(this.cost);
        return sb.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}
