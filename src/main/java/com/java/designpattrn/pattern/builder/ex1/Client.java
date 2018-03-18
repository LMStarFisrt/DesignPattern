package com.java.designpattrn.pattern.builder.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public class Client {

    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        List<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        benz.setSequence(sequence);
        benz.run();
    }
}
