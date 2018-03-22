package com.java.designpattrn.pattern.mediator.ex2;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
