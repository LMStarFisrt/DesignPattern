package com.java.designpattrn.principle.LSP.ex2;

import java.util.Collection;
import java.util.Map;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Son1 extends Father1 {

    public Collection doSomething(Map map) {
        System.out.println("子类被执行......");
        return map.values();
    }
}
