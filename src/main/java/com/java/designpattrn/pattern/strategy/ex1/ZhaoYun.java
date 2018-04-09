package com.java.designpattrn.pattern.strategy.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        System.out.println("刚刚到吴国时拆第一个");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println();
        System.out.println("拆第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println();
        System.out.println("拆第三个");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
