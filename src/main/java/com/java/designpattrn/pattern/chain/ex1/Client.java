package com.java.designpattrn.pattern.chain.ex1;

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
        List<IWomen> women = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            women.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        IHandler father = new Father();
        IHandler huaband = new Husband();
        IHandler son = new Son();

        for (IWomen w :
                women) {
            if (w.getType() == 1) {
                System.out.println("\n-----------女儿向父亲请示------------");
                father.handleMessage(w);
            } else if (w.getType() == 2) {
                System.out.println("\n-----------妻子向丈夫请示------------");
                huaband.handleMessage(w);
            } else if (w.getType() == 3) {
                System.out.println("\n-----------母亲向儿子请示------------");
                son.handleMessage(w);
            }
        }
    }
}
