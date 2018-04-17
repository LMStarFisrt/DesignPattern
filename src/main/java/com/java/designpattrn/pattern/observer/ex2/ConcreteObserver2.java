package com.java.designpattrn.pattern.observer.ex2;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void update() {
        System.out.println("concrete observer 2 update");
    }
}
