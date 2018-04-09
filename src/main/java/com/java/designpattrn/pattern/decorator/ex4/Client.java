package com.java.designpattrn.pattern.decorator.ex4;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Client {

    public static void main(String[] args) {
        Component component;
        component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
