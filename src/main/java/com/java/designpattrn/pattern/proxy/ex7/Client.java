package com.java.designpattrn.pattern.proxy.ex7;

import java.lang.reflect.InvocationHandler;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finished");
    }

}
