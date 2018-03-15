package com.java.designpattrn.pattern.factory.ex4;

import java.lang.reflect.Constructor;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class c1 = Class.forName(Singleton.class.getName());
            Constructor constructor = c1.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
