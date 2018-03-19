package com.java.designpattrn.pattern.proxy.ex4;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public interface IGamePlayer {

    void login(String user, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
