package com.java.designpattrn.pattern.observer.ex2;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class ConcreteSubject extends Subject {

    public void doSomething() {
        System.out.println("concrete subject do something");
        super.notifyObservers();
    }
}
