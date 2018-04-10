package com.java.designpattrn.pattern.adapter.ex3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "员工职位");
        officeInfo.put("officeTelNumber", "员工办公电话");
        return officeInfo;
    }
}
