package com.java.designpattrn.pattern.builder.ex2;

import com.java.designpattrn.pattern.builder.ex1.CarModel;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
