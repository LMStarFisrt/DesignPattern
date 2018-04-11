package com.java.designpattrn.pattern.iterator.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class Boss {

    public static void main(String[] args) {
        List<IProject> projectList = new ArrayList<>();
        projectList.add(new Project("星球大战项目", 10, 100000));
        projectList.add(new Project("扭转时空项目", 100, 1000000));
        projectList.add(new Project("超人改造项目", 10000, 100000000));

        for (IProject p : projectList) {
            System.out.println(p.getProjectInfo());
        }
    }
}
