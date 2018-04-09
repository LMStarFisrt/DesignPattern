package com.java.designpattrn.pattern.strategy.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
