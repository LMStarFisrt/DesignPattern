package com.java.designpattrn.pattern.abstractfactory.ex1;

/**
 * @author dadisdad
 * @date 2018/3/17
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("----生产一个黄色人种女性----");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("----生产一个黄色人种男性----");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

        Human maleWhitewHuman = maleHumanFactory.createWhiteHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        System.out.println("----生产一个白色人种女性----");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
        System.out.println("----生产一个白色人种男性----");
        maleWhitewHuman.getColor();
        maleWhitewHuman.talk();
        maleWhitewHuman.getSex();

        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        System.out.println("----生产一个黑色人种女性----");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
        System.out.println("----生产一个黑色人种男性----");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
    }

}
