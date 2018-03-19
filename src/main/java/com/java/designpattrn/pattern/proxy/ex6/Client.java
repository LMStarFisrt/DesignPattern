package com.java.designpattrn.pattern.proxy.ex6;

import com.java.designpattrn.pattern.proxy.ex1.IGamePlayer;
import com.java.designpattrn.pattern.proxy.ex1.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("开始时间是2018-03-01 10：10");

        ClassLoader c1 = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(c1, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是2018-03-02 10：10");
    }
}
