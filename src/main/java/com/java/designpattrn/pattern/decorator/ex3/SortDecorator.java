package com.java.designpattrn.pattern.decorator.ex3;

import com.java.designpattrn.pattern.decorator.ex1.SchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("排名第38名");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}
