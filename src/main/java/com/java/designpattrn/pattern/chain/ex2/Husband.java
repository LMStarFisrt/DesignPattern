package com.java.designpattrn.pattern.chain.ex2;

import com.java.designpattrn.pattern.chain.ex1.IWomen;

/**
 * @author 10308
 * @date 2018/4/6
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
