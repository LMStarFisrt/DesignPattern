package com.java.designpattrn.principle.ISP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public abstract class AbstractSearcher {

    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();
}
