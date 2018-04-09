package com.java.designpattrn.pattern.decorator.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReport();
        sr.report();
        //sr.sign("test");
    }
}
