package com.java.designpattrn.pattern.composite.ex5;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public abstract class Component {

    public void doSomething() {

    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> getChildren();
}
