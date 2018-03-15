package com.java.designpattrn.pattern.factory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
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
