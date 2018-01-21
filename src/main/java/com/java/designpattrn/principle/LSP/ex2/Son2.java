package com.java.designpattrn.principle.LSP.ex2;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Son2 extends Father2 {

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行......");
        return map.values();
    }
}
