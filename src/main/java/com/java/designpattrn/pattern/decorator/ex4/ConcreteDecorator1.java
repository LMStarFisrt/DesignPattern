package com.java.designpattrn.pattern.decorator.ex4;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void operateBefore() {
        System.out.println("before");
    }

    @Override
    public void operate() {
        operateBefore();
        super.operate();
    }
}
