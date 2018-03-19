package com.java.designpattrn.pattern.proxy.ex7;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行前置通知");
    }
}
