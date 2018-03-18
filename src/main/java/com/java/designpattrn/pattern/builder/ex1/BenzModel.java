package com.java.designpattrn.pattern.builder.ex1;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    @Override
    protected void enginBoom() {
        System.out.println("奔驰车引擎发出声音");
    }
}
