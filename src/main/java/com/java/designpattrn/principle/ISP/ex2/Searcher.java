package com.java.designpattrn.principle.ISP.ex2;

import com.java.designpattrn.principle.ISP.ex1.IPrettyGirl;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IGoodBodyGirl prettyGirl) {
        super(prettyGirl);
    }

    public Searcher(IGreatTemperamentGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void showGoodBodyGirl() {
        super.goodBodyGirl.goodLooking();
        super.goodBodyGirl.niceFigure();
    }

    @Override
    public void showGreatTemperamentGirl() {
        super.greatTemperamentGirl.greatTemperament();
    }
}
