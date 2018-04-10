package com.java.designpattrn.pattern.adapter.ex3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 10308
 * @date 2018/4/10
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "员工叫张三");
        baseInfoMap.put("mobileNumber", "员工电话");
        return baseInfoMap;
    }
}
