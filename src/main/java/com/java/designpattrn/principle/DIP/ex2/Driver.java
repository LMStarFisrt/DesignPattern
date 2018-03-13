package com.java.designpattrn.principle.DIP.ex2;

/**
 * @author dadisdad
 * @date 2018/3/13
 */
public class Driver implements IDriver {
    @Override
    public void driver(ICar car) {
        car.run();
    }
}
