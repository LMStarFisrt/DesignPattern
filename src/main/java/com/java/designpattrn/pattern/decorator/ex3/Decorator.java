package com.java.designpattrn.pattern.decorator.ex3;

import com.java.designpattrn.pattern.decorator.ex1.SchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        sr.report();
    }

    @Override
    public void sign(String name) {
        sr.sign(name);
    }
}
