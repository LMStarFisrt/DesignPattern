package com.java.designpattrn.pattern.singleton.ex4;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}
