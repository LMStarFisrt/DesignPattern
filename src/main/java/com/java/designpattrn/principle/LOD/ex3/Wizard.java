package com.java.designpattrn.principle.LOD.ex3;

import java.util.Random;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class Wizard {

    private Random rand = new Random(System.currentTimeMillis());

    public int first(){
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    public int second(){
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    public int third(){
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }

}
