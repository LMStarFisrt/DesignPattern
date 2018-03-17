package com.java.designpattrn.pattern.abstractfactory.ex2;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
