package com.java.designpattrn.pattern.template.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class Client {

    public static void main(String[] args) {
        HummerModel H1 = new HummerH1Model();
        H1.run();
        HummerModel H2 = new HummerH2Model();
        H2.run();
    }

}
