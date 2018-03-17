package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
