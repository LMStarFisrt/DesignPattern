package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的。");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话");
    }
}
