package com.java.designpattrn.pattern.builder.ex2;

import com.java.designpattrn.pattern.builder.ex1.BMWModel;
import com.java.designpattrn.pattern.builder.ex1.CarModel;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
