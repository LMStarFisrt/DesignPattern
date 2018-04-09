package com.java.designpattrn.pattern.strategy.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        strategy.operate();
    }
}
