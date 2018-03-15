package com.java.designpattrn.pattern.factory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话。");
    }
}
