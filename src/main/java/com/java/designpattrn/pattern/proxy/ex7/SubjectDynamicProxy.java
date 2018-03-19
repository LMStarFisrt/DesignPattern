package com.java.designpattrn.pattern.proxy.ex7;

import java.lang.reflect.InvocationHandler;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();

        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
