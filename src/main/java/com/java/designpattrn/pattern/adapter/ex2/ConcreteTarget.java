package com.java.designpattrn.pattern.adapter.ex2;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("Target request");
    }
}
