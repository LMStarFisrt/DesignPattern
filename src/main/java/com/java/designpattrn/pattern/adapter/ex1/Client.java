package com.java.designpattrn.pattern.adapter.ex1;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class Client {

    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        userInfo.getHomeAddress();
        userInfo.getUserName();

        IUserInfo outerUserInfo = new OuterUserInfo();
        outerUserInfo.getUserName();
        outerUserInfo.getHomeAddress();
    }
}
