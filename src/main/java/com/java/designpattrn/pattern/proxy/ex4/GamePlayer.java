package com.java.designpattrn.pattern.proxy.ex4;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("用户" + this.name + "登录成功");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "升级了");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
