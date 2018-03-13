package com.java.designpattrn.principle.DIP.ex2;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Client {

    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        ICar bmw = new BMW();
        zhangSan.driver(benz);
        zhangSan.driver(bmw);
    }
}
