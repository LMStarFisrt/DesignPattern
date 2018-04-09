package com.java.designpattrn.pattern.decorator.ex3;

import com.java.designpattrn.pattern.decorator.ex1.FouthGradeSchoolReport;
import com.java.designpattrn.pattern.decorator.ex1.SchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
