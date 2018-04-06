package com.java.designpattrn.pattern.chain.ex2;

import com.java.designpattrn.pattern.chain.ex1.IWomen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 10308
 * @date 2018/4/6
 */
public class Client {

    public static void main(String[] args) {
        Random rand = new Random();
        List<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(rand.nextInt(4), "我要去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen w : list) {
            father.handleMessage(w);
        }
    }
}
