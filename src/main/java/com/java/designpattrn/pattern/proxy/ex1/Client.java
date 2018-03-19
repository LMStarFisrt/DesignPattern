package com.java.designpattrn.pattern.proxy.ex1;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是2018-03-01 10：10");
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");
    }

}
