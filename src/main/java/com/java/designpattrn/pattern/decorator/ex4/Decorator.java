package com.java.designpattrn.pattern.decorator.ex4;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
