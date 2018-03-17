package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
