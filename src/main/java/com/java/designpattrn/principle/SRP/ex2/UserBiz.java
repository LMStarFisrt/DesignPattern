package com.java.designpattrn.principle.SRP.ex2;

/**
 * Created by dadisdad on 2016/10/30.
 */
public class UserBiz implements IUserBiz {

    public boolean changePassword(String oldPwd, String newPwd) {
        return false;
    }

    public boolean delete(IUserBo userBo) {
        return false;
    }

    public void mapUser(IUserBo userBo) {

    }

    public boolean addOrg(IUserBo userBo, int orgID) {
        return false;
    }

    public boolean addRole(IUserBo userBo, int roleID) {
        return false;
    }
}
