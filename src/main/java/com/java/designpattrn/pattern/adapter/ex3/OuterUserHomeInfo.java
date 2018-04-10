package com.java.designpattrn.pattern.adapter.ex3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "员工家庭电话");
        homeInfo.put("homeAddress", "员工家庭住址");
        return homeInfo;
    }
}
