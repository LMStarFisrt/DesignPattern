package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class MaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
