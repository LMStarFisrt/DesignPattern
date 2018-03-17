package com.java.designpattrn.pattern.abstractfactory.ex2;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class Client {

    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA A1 = creator1.createProductA();
        AbstractProductA A2 = creator2.createProductA();
        A1.method1();
        A1.doSomething();
        A2.method1();
        A2.doSomething();

        AbstractProductB B1 = creator1.createProductB();
        AbstractProductB B2 = creator2.createProductB();
        B1.method();
        B1.doSomething();
        B2.method();
        B2.doSomething();
    }

}
