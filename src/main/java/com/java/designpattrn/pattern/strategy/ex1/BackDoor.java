package com.java.designpattrn.pattern.strategy.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
