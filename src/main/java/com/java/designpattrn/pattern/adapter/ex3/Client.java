package com.java.designpattrn.pattern.adapter.ex3;

import com.java.designpattrn.pattern.adapter.ex1.IUserInfo;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class Client {

    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        IUserInfo userInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        userInfo.getUserName();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
        userInfo.getJobPosition();
    }
}
