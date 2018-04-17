package com.java.designpattrn.pattern.observer.ex3;

import java.util.Observable;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
