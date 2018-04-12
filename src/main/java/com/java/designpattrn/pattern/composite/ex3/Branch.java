package com.java.designpattrn.pattern.composite.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Branch extends Corp {

    List<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void add(Corp corp) {
        corp.setParent(this);
        subordinateList.add(corp);
    }

    public List<Corp> getSubordinate() {
        return subordinateList;
    }
}
