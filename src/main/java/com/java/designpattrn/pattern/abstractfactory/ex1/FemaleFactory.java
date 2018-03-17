package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
