package main.java.com.java.designpattrn.principle.SRP.ex1;

/**
 * 负责用户的行为
 * Created by dadisdad on 2016/10/30.
 */
public interface IUserBiz {

    boolean changePassword(String oldPwd,String newPwd);
    boolean delete(IUserBo userBo);
    void mapUser(IUserBo userBo);
    boolean addOrg(IUserBo userBo,int orgID);
    boolean addRole(IUserBo userBo,int roleID);

}
