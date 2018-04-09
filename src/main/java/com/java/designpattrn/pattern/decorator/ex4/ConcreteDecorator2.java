package com.java.designpattrn.pattern.decorator.ex4;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void after() {
        System.out.println("after");
    }

    @Override
    public void operate() {
        super.operate();
        after();
    }
}
