package com.java.designpattrn.principle.LSP.ex2;

import java.util.Collection;
import java.util.Map;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Father2 {

    public Collection doSomething(Map map){
        System.out.println("父类被执行......");
        return map.values();
    }

}
