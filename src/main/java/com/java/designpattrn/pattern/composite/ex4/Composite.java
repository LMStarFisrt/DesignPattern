package com.java.designpattrn.pattern.composite.ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public List<Component> getChildren() {
        return list;
    }
}
