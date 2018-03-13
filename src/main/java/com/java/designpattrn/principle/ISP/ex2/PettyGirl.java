package com.java.designpattrn.principle.ISP.ex2;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "颜值高");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "身材好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "气质佳");
    }
}
