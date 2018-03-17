package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
