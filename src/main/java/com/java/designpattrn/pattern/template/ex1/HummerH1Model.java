package com.java.designpattrn.pattern.template.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class HummerH1Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎发出声音");
    }
}
