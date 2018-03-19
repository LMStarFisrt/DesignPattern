package com.java.designpattrn.pattern.proxy.ex7;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class AfterAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行后置通知");
    }
}
