package com.java.designpattrn.pattern.strategy.ex2;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("策略1运算法则");
    }
}
