package com.java.designpattrn.pattern.decorator.ex2;

import com.java.designpattrn.pattern.decorator.ex1.SchoolReport;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("老三");
    }
}
