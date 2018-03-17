package com.java.designpattrn.pattern.abstractfactory.ex2;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
