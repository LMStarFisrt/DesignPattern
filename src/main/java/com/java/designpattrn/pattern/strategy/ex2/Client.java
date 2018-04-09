package com.java.designpattrn.pattern.strategy.ex2;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();
        Context context = new Context(strategy2);
        context.doAnything();
    }
}
