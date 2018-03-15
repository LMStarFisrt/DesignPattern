package com.java.designpattrn.pattern.factory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话。");
    }
}
