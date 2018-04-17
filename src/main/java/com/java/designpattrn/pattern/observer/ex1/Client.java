package com.java.designpattrn.pattern.observer.ex1;

/**
 * @author dadisdad
 * @date 2018/4/17
 */
public class Client {

    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer liusi = new LiuSi();
        Observer wangsi = new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(liusi);
        hanFeiZi.addObserver(wangsi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
