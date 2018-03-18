package com.java.designpattrn.pattern.builder.ex3;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getCBMWModel().run();
        director.getDBMWModel().run();
    }

}
