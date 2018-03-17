package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {

    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
