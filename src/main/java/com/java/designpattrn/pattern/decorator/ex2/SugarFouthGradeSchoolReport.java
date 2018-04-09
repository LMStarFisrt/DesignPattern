package com.java.designpattrn.pattern.decorator.ex2;

import com.java.designpattrn.pattern.decorator.ex1.FouthGradeSchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    private void reportSort() {
        System.out.println("排名第38名");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
        reportSort();
    }
}
