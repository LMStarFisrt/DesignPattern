package com.java.designpattrn.pattern.composite.ex5;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Leaf extends Component {

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public List<Component> getChildren() {
        return null;
    }
}
