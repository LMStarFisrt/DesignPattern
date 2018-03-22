package com.java.designpattrn.pattern.mediator.ex2;

/**
 * @author dadisdad
 * @date 2018/3/22
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Stock stock;
    protected Sale sale;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.stock = new Stock(this);
        this.sale = new Sale(this);
    }

    public abstract void execute(String str, Object... objects);
}
