package com.java.designpattrn.pattern.singleton.ex2;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Singleton2 {

    private static Singleton2 singleton2=new Singleton2();

    private Singleton2(){

    }

    public synchronized static Singleton2 getInstance(){
        if(singleton2==null){
            singleton2=new Singleton2();
        }
        return singleton2;
    }
}
