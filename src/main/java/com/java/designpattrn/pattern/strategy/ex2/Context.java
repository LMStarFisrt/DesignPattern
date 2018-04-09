package com.java.designpattrn.pattern.strategy.ex2;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        strategy.doSomething();
    }
}
