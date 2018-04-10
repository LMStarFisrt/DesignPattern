package com.java.designpattrn.pattern.adapter.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class OuterUser implements IOuterUser {

    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "员工叫张三");
        baseInfoMap.put("mobileNumber", "员工电话");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "员工职位");
        officeInfo.put("officeTelNumber", "员工办公电话");
        return officeInfo;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "员工家庭电话");
        homeInfo.put("homeAddress", "员工家庭住址");
        return homeInfo;
    }
}
