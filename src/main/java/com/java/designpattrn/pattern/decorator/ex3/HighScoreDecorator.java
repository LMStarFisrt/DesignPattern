package com.java.designpattrn.pattern.decorator.ex3;

import com.java.designpattrn.pattern.decorator.ex1.SchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
