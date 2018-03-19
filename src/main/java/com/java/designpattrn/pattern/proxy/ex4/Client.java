package com.java.designpattrn.pattern.proxy.ex4;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("李四");
        System.out.println("开始时间是2018-03-01 10：10");
        player.login("lisi", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");

        System.out.println();
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间是2018-03-01 10：10");
        proxy.login("lisi", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");

        System.out.println();
        IGamePlayer proxyR = player.getProxy();
        System.out.println("开始时间是2018-03-01 10：10");
        proxy.login("lisi", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");
    }
}
