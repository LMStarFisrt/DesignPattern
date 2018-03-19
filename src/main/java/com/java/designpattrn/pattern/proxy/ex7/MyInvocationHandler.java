package com.java.designpattrn.pattern.proxy.ex7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object = null;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(object, args);
        new AfterAdvice().exec();
        return obj;
    }
}
