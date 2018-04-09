package com.java.designpattrn.pattern.strategy.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
