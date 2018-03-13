package com.java.designpattrn.principle.DIP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Client {

    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        Benz benz = new Benz();
        zhangSan.driver(benz);
    }

}
