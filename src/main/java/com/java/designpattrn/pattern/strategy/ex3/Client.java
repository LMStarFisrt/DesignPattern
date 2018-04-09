package com.java.designpattrn.pattern.strategy.ex3;

import java.util.Arrays;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Client {

    public static final String ADD_SYMBOL = "+";

    public static final String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        Context context = null;
        if (ADD_SYMBOL.equals(symbol)) {
            context = new Context(new Add());
        } else if (SUB_SYMBOL.equals(symbol)) {
            context = new Context(new Sub());
        }

        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}
