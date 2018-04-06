package com.java.designpattrn.pattern.chain.ex2;

import com.java.designpattrn.pattern.chain.ex1.IWomen;

/**
 * @author 10308
 * @date 2018/4/6
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
