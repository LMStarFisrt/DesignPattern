package com.java.designpattrn.pattern.observer.ex2;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class Client {

    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.doSomething();
    }
}
