package com.java.designpattrn.pattern.chain.ex2;

import com.java.designpattrn.pattern.chain.ex1.IWomen;

/**
 * @author 10308
 * @date 2018/4/6
 */
public abstract class Handler {

    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    protected abstract void response(IWomen women);

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("没地方请示，按不同意处理");
            }
        }
    }

}
