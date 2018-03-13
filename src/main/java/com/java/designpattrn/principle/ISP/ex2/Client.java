package com.java.designpattrn.principle.ISP.ex2;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Client {

    public static void main(String[] args) {
        IGoodBodyGirl yanYan = new PettyGirl("嫣嫣");
        IGreatTemperamentGirl yiFei = new PettyGirl("亦菲");
        AbstractSearcher searcher1 = new Searcher(yanYan);
        AbstractSearcher searcher2 = new Searcher(yiFei);
        searcher1.showGoodBodyGirl();
        searcher2.showGreatTemperamentGirl();
    }
}
