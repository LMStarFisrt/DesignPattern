package com.java.designpattrn.pattern.iterator.ex2;

public interface IProject {

    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
