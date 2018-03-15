package com.java.designpattrn.pattern.factory.ex2;

import com.java.designpattrn.pattern.factory.ex1.AbstractHumanFactory;
import com.java.designpattrn.pattern.factory.ex1.Human;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
