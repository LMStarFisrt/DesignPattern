package com.java.designpattrn.pattern.composite.ex1;

import java.util.List;

public interface IBranch {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    List getSubordonateInfo();
}
