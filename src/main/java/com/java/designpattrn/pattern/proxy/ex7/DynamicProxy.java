package com.java.designpattrn.pattern.proxy.ex7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        new BeforeAdvice().exec();
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
