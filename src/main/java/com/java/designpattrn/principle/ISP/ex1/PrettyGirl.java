package com.java.designpattrn.principle.ISP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class PrettyGirl implements IPrettyGirl {

    private String name;

    public PrettyGirl(String name) {
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
