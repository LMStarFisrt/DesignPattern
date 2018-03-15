package com.java.designpattrn.pattern.factory.ex4;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class Client {

    public static void main(String[] args) {
        Singleton s1 = SingletonFactory.getSingleton();
        Singleton s2 = SingletonFactory.getSingleton();
        System.out.println(s1 == s2);
    }
}
