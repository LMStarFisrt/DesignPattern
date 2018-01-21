package com.java.designpattrn.principle.LSP.ex2;

import java.util.HashMap;

/**
 * Created by dadisdad on 2016/11/1.
 */
public class Client {

    public static void invoke1_1(){
        Father1 f1=new Father1();
        HashMap map=new HashMap();
        f1.doSomething(map);
    }

    public static void invoke1_2(){
        Son1 s1=new Son1();
        HashMap map=new HashMap();
        s1.doSomething(map);
    }

    public static void invoke2_1(){
        Father2 f2=new Father2();
        HashMap map=new HashMap();
        f2.doSomething(map);
    }

    public static void invoke2_2(){
        Son2 s2=new Son2();
        HashMap map=new HashMap();
        s2.doSomething(map);
    }

    public static void main(String[] args) {
        invoke1_1();
        invoke1_2();
        invoke2_1();
        invoke2_2();
    }

}
