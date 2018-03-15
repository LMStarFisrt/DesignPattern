package com.java.designpattrn.pattern.factory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话。");
    }
}
