package com.java.designpattrn.pattern.builder.ex2;

import com.java.designpattrn.pattern.builder.ex1.BenzModel;
import com.java.designpattrn.pattern.builder.ex1.CarModel;

import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
