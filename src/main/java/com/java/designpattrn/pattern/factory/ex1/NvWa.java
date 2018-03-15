package com.java.designpattrn.pattern.factory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/15
 */
public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory yinYangLu = new HumanFactory();
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
