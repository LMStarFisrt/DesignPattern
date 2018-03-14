package com.java.designpattrn.pattern.singleton.ex2;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class SingletonTest {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(() -> {
                Singleton1 singleton1=Singleton1.getInstance();
                System.out.println(singleton1.hashCode());
            }).start();
        }

        for (int i=0;i<10;i++){
            new Thread(() -> {
                Singleton2 singleton2=Singleton2.getInstance();
                System.out.println(singleton2.hashCode());
            }).start();
        }

        for (int i=0;i<10;i++){
            new Thread(() -> {
                Singleton3 singleton3=Singleton3.getInstance();
                System.out.println(singleton3.hashCode());
            }).start();
        }
    }

}
