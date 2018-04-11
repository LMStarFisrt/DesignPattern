package com.java.designpattrn.pattern.iterator.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class Boss {

    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 1000000);
        project.add("超人改造项目", 10000, 100000000);

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
