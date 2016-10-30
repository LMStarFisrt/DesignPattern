package main.java.com.java.designpattrn.principle.SRP.ex2;

/**
 * 负责用户的属性
 * Created by dadisdad on 2016/10/30.
 */
public interface IUserBo {

    void setUserID(String UserID);
    String getUserID();
    void setPassword(String password);
    String getPassword();
    void setUserName(String userName);
    String getUserName();

}
