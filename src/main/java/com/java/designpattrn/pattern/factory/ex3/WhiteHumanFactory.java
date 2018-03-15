package com.java.designpattrn.pattern.factory.ex3;

import com.java.designpattrn.pattern.factory.ex1.Human;
import com.java.designpattrn.pattern.factory.ex1.WhiteHuman;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
