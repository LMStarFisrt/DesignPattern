package com.java.designpattrn.pattern.chain.ex2;

import com.java.designpattrn.pattern.chain.ex1.IWomen;

/**
 * @author 10308
 * @date 2018/4/6
 */
public class Women implements IWomen {

    /**
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (type) {
            case 1:
                this.request = "女儿的请求时：" + request;
                break;
            case 2:
                this.request = "妻子的请求时：" + request;
                break;
            case 3:
                this.request = "母亲的请求时：" + request;
                break;
            default:
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
