package com.java.designpattrn.pattern.composite.ex2;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/4/12
 */
public interface IBranch extends ICorp {

    void add(ICorp corp);

    List getSubordinate();
}
