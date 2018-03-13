package com.java.designpattrn.principle.ISP.ex2;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public abstract class AbstractSearcher {

    protected IGoodBodyGirl goodBodyGirl;

    protected IGreatTemperamentGirl greatTemperamentGirl;

    public AbstractSearcher(IGoodBodyGirl prettyGirl) {
        this.goodBodyGirl = prettyGirl;
    }

    public AbstractSearcher(IGreatTemperamentGirl prettyGirl) {
        this.greatTemperamentGirl = prettyGirl;
    }

    public abstract void showGoodBodyGirl();

    public abstract void showGreatTemperamentGirl();
}
