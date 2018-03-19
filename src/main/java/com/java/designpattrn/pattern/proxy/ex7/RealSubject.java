package com.java.designpattrn.pattern.proxy.ex7;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something---" + str);
    }
}
