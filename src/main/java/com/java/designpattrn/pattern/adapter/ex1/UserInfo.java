package com.java.designpattrn.pattern.adapter.ex1;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工手机");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工座机");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工家庭电话");
        return null;
    }
}
