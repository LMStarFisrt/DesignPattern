package com.java.designpattrn.pattern.proxy.ex3;

import com.java.designpattrn.pattern.proxy.ex1.IGamePlayer;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class GamePlayer implements IGamePlayer {

    private String username;

    public GamePlayer(IGamePlayer gamePlayer, String username) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        } else {
            this.username = username;
        }
    }

    @Override
    public void login(String username, String password) {
        System.out.println("用户" + this.username + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.username + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.username + "升级了");
    }
}
