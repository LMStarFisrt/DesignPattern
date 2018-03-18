package com.java.designpattrn.pattern.builder.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadisdad
 * @date 2018/3/18
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void enginBoom();

    public final void run() {
        sequence.forEach(s -> {
            if (s.equals("start")) {
                this.start();
            } else if (s.equals("stop")) {
                this.stop();
            } else if (s.equals("alarm")) {
                this.alarm();
            } else if (s.equals("engine boom")) {
                this.enginBoom();
            }
        });
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
