package com.java.designpattrn.pattern.iterator.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10308
 * @date 2018/4/11
 */
public class ProjectIterator implements IProjectIterator {

    private List<IProject> projectList = new ArrayList<>();

    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (currentItem >= projectList.size() || projectList.get(currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return projectList.get(currentItem++);
    }
}
