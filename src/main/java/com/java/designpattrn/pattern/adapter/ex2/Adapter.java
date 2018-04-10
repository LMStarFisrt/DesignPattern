package com.java.designpattrn.pattern.adapter.ex2;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}
