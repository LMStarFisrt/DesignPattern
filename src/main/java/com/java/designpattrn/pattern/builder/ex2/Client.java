package com.java.designpattrn.pattern.builder.ex2;

import com.java.designpattrn.pattern.builder.ex1.BMWModel;
import com.java.designpattrn.pattern.builder.ex1.BenzModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class Client {

    public static void main(String[] args) {

        List<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
    }

}
