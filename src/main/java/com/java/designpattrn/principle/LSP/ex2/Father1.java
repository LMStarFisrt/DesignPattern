package main.java.com.java.designpattrn.principle.LSP.ex2;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Father1 {

    public Collection doSomething(HashMap map){
        System.out.println("父类被执行......");
        return map.values();
    }

}
