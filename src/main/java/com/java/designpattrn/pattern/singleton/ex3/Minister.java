package com.java.designpattrn.pattern.singleton.ex3;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Minister {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Emperor emperor=Emperor.getInstance();
            System.out.print("第"+i+"个大臣参见了：");
            emperor.say();
        }
    }

}
