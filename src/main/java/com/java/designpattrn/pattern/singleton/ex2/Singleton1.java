package com.java.designpattrn.pattern.singleton.ex2;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Singleton1 {

    private static Singleton1 singleton1=new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return singleton1;
    }

}
