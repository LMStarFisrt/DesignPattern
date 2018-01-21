package com.java.designpattrn.principle.LSP.ex1;

/**
 * 手枪
 * Created by dadisdad on 2016/11/1.
 */
public class HandGun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("手枪射击......");
    }
}
