package com.java.designpattrn.principle.ISP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        System.out.println("---美女信息如下---");
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }
}
