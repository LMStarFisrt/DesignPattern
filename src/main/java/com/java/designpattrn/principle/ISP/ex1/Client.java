package com.java.designpattrn.principle.ISP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Client {

    public static void main(String[] args) {
        IPrettyGirl yanYan = new PrettyGirl("嫣嫣");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
