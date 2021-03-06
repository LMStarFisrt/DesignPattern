package com.java.designpattrn.pattern.proxy.ex6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dadisdad
 * @date 2018/3/19
 */
public class GamePlayIH implements InvocationHandler {

    /**
     * 被代理者
     */
    Class cls = null;

    /**
     * 被代理的实例
     */
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录！");
        }
        return result;
    }
}
