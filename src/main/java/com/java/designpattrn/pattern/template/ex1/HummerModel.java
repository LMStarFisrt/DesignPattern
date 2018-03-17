package com.java.designpattrn.pattern.template.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
