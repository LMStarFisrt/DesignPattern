package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public abstract class AbstractBlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的。");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话");
    }
}
