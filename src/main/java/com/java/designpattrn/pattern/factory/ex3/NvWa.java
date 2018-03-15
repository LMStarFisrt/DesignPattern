package com.java.designpattrn.pattern.factory.ex3;

import com.java.designpattrn.pattern.factory.ex1.AbstractHumanFactory;
import com.java.designpattrn.pattern.factory.ex1.*;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class NvWa {

    public static void main(String[] args) {
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
