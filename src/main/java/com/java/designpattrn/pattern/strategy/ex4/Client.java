package com.java.designpattrn.pattern.strategy.ex4;

import java.util.Arrays;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Client {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}
