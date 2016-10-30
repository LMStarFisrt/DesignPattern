package main.java.com.java.designpattrn.principle.SRP.ex1;

/**
 * 用户类
 * Created by dadisdad on 2016/10/30.
 */
public class UserInfo implements IUserInfo{

    public void setUserID(String UserID) {

    }

    public boolean changePassword(String oldPwd, String newPwd) {
        return false;
    }

    public String getUserID() {
        return null;
    }

    public void setPassword(String password) {

    }

    public boolean delete(IUserBo userBo) {
        return false;
    }

    public void mapUser(IUserBo userBo) {

    }

    public String getPassword() {
        return null;
    }

    public void setUserName(String userName) {

    }

    public boolean addOrg(IUserBo userBo, int orgID) {
        return false;
    }

    public String getUserName() {
        return null;
    }

    public boolean addRole(IUserBo userBo, int roleID) {
        return false;
    }
}
