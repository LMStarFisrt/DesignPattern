package com.java.designpattrn.pattern.observer.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class HanFeiZi implements Observable, IHanFeiZi {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了");
        notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了");
        notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }
}
