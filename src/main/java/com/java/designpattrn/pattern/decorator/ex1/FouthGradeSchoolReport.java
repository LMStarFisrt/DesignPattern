package com.java.designpattrn.pattern.decorator.ex1;

/**
 * @author 10308
 * @date 2018/4/9
 */
public class FouthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("尊敬的家长：");
        System.out.println("........");
        System.out.println("语文62 数学65 体育98 自然63");
        System.out.println("........");
        System.out.println("      家长签名：      ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
