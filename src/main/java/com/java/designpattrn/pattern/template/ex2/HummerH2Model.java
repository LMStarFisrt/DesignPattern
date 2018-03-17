package com.java.designpattrn.pattern.template.ex2;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎发出声音");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
