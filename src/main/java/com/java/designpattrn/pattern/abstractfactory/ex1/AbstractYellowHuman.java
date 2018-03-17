package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的。");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话");
    }
}
