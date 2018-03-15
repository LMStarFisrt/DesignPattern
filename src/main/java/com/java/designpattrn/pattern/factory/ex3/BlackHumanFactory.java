package com.java.designpattrn.pattern.factory.ex3;

import com.java.designpattrn.pattern.factory.ex1.BlackHuman;
import com.java.designpattrn.pattern.factory.ex1.Human;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
