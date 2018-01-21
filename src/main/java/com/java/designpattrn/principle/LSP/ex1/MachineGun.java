package com.java.designpattrn.principle.LSP.ex1;

/**
 * 机枪
 * Created by dadisdad on 2016/11/1.
 */
public class MachineGun extends AbstractGun{

    @Override
    public void shoot() {
        System.out.println("机枪射击......");
    }
}
