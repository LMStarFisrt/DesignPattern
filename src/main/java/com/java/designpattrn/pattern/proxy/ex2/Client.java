package com.java.designpattrn.pattern.proxy.ex2;

import com.java.designpattrn.pattern.proxy.ex1.GamePlayer;
import com.java.designpattrn.pattern.proxy.ex1.IGamePlayer;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间是2018-03-01 10：10");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");
    }

}
