package com.java.designpattrn.pattern.factory.ex3;

import com.java.designpattrn.pattern.factory.ex1.Human;
import com.java.designpattrn.pattern.factory.ex1.YellowHuman;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
