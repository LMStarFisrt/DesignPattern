package com.java.designpattrn.pattern.strategy.ex3;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Sub implements Calculator {

    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
