package com.java.designpattrn.pattern.adapter.ex2;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target1 = new Adapter();
        target1.request();
    }
}
