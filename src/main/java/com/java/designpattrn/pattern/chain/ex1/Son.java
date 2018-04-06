package com.java.designpattrn.pattern.chain.ex1;

/**
 * @author 10308
 * @date 2018/4/6
 */
public class Son implements IHandler {

    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请求是：" + women.getRequest());
        System.out.println("同意");
    }
}
