package com.java.designpattrn.principle.SRP.ex1;

/**
 * 用户测试类
 * Created by dadisdad on 2016/10/30.
 */
public class User {
    public static void main(String[] args) {
        IUserInfo userInfo=new UserInfo();
        IUserBo userBo=userInfo;
        userBo.setPassword("123");
        IUserBiz userBiz=userInfo;
        userBiz.delete(userBo);
    }
}
