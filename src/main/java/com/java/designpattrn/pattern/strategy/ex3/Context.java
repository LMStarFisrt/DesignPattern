package com.java.designpattrn.pattern.strategy.ex3;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Context {

    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b, String symbol) {
        return calculator.exec(a, b);
    }
}
