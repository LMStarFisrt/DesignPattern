package com.java.designpattrn.pattern.template.ex2;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    protected boolean isAlarm() {
        return true;
    }

    public final void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
