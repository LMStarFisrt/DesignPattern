package com.java.designpattrn.pattern.adapter.ex1;

import java.util.Map;

public interface IOuterUser {

    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserOfficeInfo();

    Map<String, String> getUserHomeInfo();
}
