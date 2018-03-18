package com.java.designpattrn.pattern.builder.ex1;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛");
    }

    @Override
    protected void enginBoom() {
        System.out.println("宝马车引擎发出声音");
    }
}
